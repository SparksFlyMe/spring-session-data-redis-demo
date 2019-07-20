package com.kaizhang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession // 开启spring-redis-session共享，其实经过测试，这里不开启这个注解也是可以正常运行的
public class SpringSessionDataRedisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSessionDataRedisDemoApplication.class, args);
    }

}
