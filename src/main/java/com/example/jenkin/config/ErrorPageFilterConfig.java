package com.example.jenkin.jenkinSpring.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.filter.ErrorPageFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ErrorPageFilterConfig {

    @Bean
    public FilterRegistrationBean<ErrorPageFilter> disableErrorPageFilter(
            ErrorPageFilter filter) {

        FilterRegistrationBean<ErrorPageFilter> registrationBean =
                new FilterRegistrationBean<>();

        registrationBean.setFilter(filter);
        registrationBean.setEnabled(false);

        return registrationBean;
    }
}
