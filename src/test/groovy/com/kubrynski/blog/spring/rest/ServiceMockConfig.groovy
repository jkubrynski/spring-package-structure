package com.kubrynski.blog.spring.rest

import com.kubrynski.blog.spring.service.ClientService
import org.mockito.Mockito
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Class setting up mocks for service layer. Using real services in api layer tests
 * usually makes no sense as they are already tested with service layer tests
 *
 * @author Jakub Kubrynski
 */
@Configuration
class ServiceMockConfig {

	@Bean
	ClientService clientService() {
		return Mockito.mock(ClientService.class)
	}
}
