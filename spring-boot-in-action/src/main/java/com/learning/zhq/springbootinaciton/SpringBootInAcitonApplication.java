package com.learning.zhq.springbootinaciton;

import com.learning.zhq.springbootinaciton.entity.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author ZHQ
 */
@SpringBootApplication
public class SpringBootInAcitonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootInAcitonApplication.class, args);
    }


    // TODO: 2019/6/28    什么时候执行
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }

}
