package com.kubrynski.blog.spring.rest

import com.kubrynski.blog.spring.service.ClientService
import org.mockito.Mockito
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Jakub Kubrynski
 */
@Configuration
class ServiceMockConfig {

	@Bean
	ClientService clientService() {
		return Mockito.mock(ClientService.class)
	}
}
