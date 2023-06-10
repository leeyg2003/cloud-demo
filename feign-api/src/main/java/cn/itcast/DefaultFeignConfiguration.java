//  cloud-demo/feign-api/src/main/java/cn/itcast/feign/config/DefaultFeignConfiguration.java
package cn.itcast;
 
import feign.Logger;
import org.springframework.context.annotation.Bean;
 
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.BASIC; // 日志级别为BASIC
    }
}