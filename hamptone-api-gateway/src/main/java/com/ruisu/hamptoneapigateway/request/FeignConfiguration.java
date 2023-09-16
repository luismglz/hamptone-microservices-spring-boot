package com.ruisu.hamptoneapigateway.request;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {


    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(
            @Value("${service.security.source-key-username}") String username,
            @Value("${service.security.source-key-password}") String password
    ) {
        return new BasicAuthRequestInterceptor(username, password);
    }
}
