package cn.itcast.order.client;

import cn.itcast.order.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("userservice")
public interface UserClient {//这个接口里面将来封装的就是所有的对userService发起的远程调用
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
