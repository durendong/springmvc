package com.durendong.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by durendong on 2017/1/19.
 * 配置Spring,用于映射路径和实际页面的位置
 */
@Configuration
@ComponentScan("com.durendong.springmvc")
@EnableWebMvc
public class MyMvcConfig {

    @Bean
    public InternalResourceViewResolver viewsReslover() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }
}
