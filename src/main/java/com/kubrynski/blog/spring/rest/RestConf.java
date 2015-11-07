package com.kubrynski.blog.spring.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Jakub Kubrynski
 */
@Configuration
@ComponentScan(basePackages = "com.kubrynski.blog.spring.rest")
@EnableWebMvc
public class RestConf {

}
