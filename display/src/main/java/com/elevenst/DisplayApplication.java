package com.elevenst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DisplayApplication {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    //스프링5에서 다른 서비스를 호출할 때는 restTemplate를 사용한다.

    public static void main(String[] args) {
        SpringApplication.run(DisplayApplication.class);
    }

}
