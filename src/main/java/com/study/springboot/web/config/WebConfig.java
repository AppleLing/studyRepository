package com.study.springboot.web.config;

import com.study.springboot.web.servlet.DemoServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

@Configuration
public class WebConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new DemoServlet(),"/demo");
    }

//    public FilterRegistrationBean filterRegistrationBean(){
//
//    }
}
