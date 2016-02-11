package com.kubrynski.blog.spring.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Configuration class for api layer. Important thing is to narrow down component scan
 * to cover only packages belonging to api layer. That's especially important in tests,
 * where we don't want Spring to try creating beans from other layers, which should be
 * tested independently.
 *
 * @author Jakub Kubrynski
 */
@Configuration
@ComponentScan(basePackages = "com.kubrynski.blog.spring.rest")
@EnableWebMvc
public class RestConf {

}
