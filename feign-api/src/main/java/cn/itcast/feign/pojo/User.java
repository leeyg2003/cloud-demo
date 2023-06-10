//    cloud-demo/feign-api/src/main/java/cn/itcast/feign/pojo/User.java
package cn.itcast.feign.pojo;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String address;
}