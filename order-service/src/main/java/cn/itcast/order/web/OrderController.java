package cn.itcast.order.web;

import cn.itcast.order.client.UserClient;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import cn.itcast.order.pojo.User;
import cn.itcast.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class OrderController {

   @Autowired
   private OrderService orderService;
   @Autowired
   private OrderMapper orderMapper;
   @Autowired
   private RestTemplate restTemplate;
    @Autowired
    private UserClient userClient;
    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        // 根据id查询订单并返回
        Order order=orderMapper.findById(orderId);

//        String url="http://localhost:8081/user/"+order.getUserId();
//        String url="http://userservice/user/"+order.getUserId();
//        User user=restTemplate.getForObject(url,User.class);
        User user=userClient.findById(order.getUserId());
        order.setUser(user);
        return order;
    }
}
