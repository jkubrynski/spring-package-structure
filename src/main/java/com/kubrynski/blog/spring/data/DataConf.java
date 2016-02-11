package com.kubrynski.blog.spring.data;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for data layer. That class can be also used in tests
 * as long as it does not contain some beans specific for particular database driver
 *
 * @author Jakub Kubrynski
 */
@Configuration
@ComponentScan(basePackages = "com.kubrynski.blog.spring.data")
public class DataConf {

}
