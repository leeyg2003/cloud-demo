//cloud-demo/eureka-server/src/main/java/cn/itcast/eureka/EurekaApplication.java
package cn.itcast.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {//psvm快捷键
        SpringApplication.run(EurekaApplication.class, args);
    }
}