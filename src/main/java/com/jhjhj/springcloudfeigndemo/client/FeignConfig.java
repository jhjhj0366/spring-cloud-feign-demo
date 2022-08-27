package com.jhjhj.springcloudfeigndemo.client;

import feign.codec.Decoder;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {


    @Bean
    Logger.Level feignLoggerLevel() {
        return Level.ALL;
    }

    @Bean
    Decoder feignDecoder() {
        return new GithubDecoder();
    }
}
