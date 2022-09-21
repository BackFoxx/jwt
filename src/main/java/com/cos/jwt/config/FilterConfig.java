package com.cos.jwt.config;

import com.cos.jwt.filter.MyFilter1;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
//    @Bean
//    public FilterRegistrationBean<MyFilter1> filter1() {
//        FilterRegistrationBean<MyFilter1> bean = new FilterRegistrationBean<>(new MyFilter1());
//        bean.addUrlPatterns("/*");
//        bean.setOrder(0);
//        return bean;
//    }
    /*
    * 시큐리티 필터 체인이 FilterRegistrationBean보다 먼저 실행
    * */
}
