package com.kubrynski.blog.spring.service

import com.kubrynski.blog.spring.data.repo.ClientRepository
import org.mockito.Mockito
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Jakub Kubrynski
 */
@Configuration
class DataMockConfig {

	@Bean
	ClientRepository clientRepository() {
		return Mockito.mock(ClientRepository)
	}
}
