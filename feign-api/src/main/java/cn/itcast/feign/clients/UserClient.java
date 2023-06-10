//  cloud-demo/feign-api/src/main/java/cn/itcast/feign/clients/UserClient.java
package cn.itcast.feign.clients;

import cn.itcast.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("userservice")
public interface UserClient {//这个接口里面将来封装的就是所有的对userService发起的远程调用
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}