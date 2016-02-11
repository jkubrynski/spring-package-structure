package com.kubrynski.blog.spring.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for service layer. Important thing is to narrow down component scan
 * to cover only packages belonging to service layer. That's especially important in tests,
 * where we don't want Spring to try creating beans from other layers.
 *
 * @author Jakub Kubrynski
 */
@Configuration
@ComponentScan(basePackages = "com.kubrynski.blog.spring.service")
public class ServiceConf {

}
