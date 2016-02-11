package com.kubrynski.blog.spring.service

import com.kubrynski.blog.spring.data.repo.ClientRepository
import org.mockito.Mockito
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Class setting up mocks for data layer. Using real repositories in service layer tests
 * usually makes no sense as all important repository functionality is already tested
 * with data tests
 *
 * @author Jakub Kubrynski
 */
@Configuration
class DataMockConfig {

	@Bean
	ClientRepository clientRepository() {
		return Mockito.mock(ClientRepository)
	}
}
