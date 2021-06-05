package com.techvlife.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {

    @Bean("objectMapper")
    public ObjectMapper getObjectMapper(){
        return new ObjectMapper();
    }
}
