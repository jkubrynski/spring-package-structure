package com.kubrynski.blog.spring

import org.springframework.boot.autoconfigure.EnableAutoConfiguration

/**
 * This class is used to activate Boot's autoconfiguration as we don't import
 * main Application class into test contexts
 *
 * @author Jakub Kubrynski
 */
@EnableAutoConfiguration
class AutoConfigCarrier {
}
