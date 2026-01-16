package com.example.jenkin.jenkinSpring.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.error.ErrorPageFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ErrorPageFilterConfig {

    @Bean
    public FilterRegistrationBean<org.springframework.boot.web.servlet.support.ErrorPageFilter> disableErrorPageFilter(
            org.springframework.boot.web.servlet.support.ErrorPageFilter filter) {

        FilterRegistrationBean<org.springframework.boot.web.servlet.support.ErrorPageFilter> bean =
                new FilterRegistrationBean<>(filter);
        bean.setEnabled(false);
        return bean;
    }
}
