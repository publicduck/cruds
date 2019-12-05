package org.apache.struts.crud;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



    @Bean
    FilterRegistrationBean<StrutsPrepareAndExecuteFilter> getStrutsPrepareAndExecuteFilter (){
        FilterRegistrationBean<StrutsPrepareAndExecuteFilter> filter = new FilterRegistrationBean<>();
        filter.setFilter(new StrutsPrepareAndExecuteFilter());
        filter.addUrlPatterns("/");
        filter.addUrlPatterns("/index.action");
        filter.addUrlPatterns("/inputPerson.action");
        filter.addUrlPatterns("/savePerson.action");
        filter.addUrlPatterns("/deletePerson.action");
        //filter.addUrlPatterns("/*Person.action");
        filter.addUrlPatterns("/list");

        filter.setOrder(1);
        return filter;

    }
}
