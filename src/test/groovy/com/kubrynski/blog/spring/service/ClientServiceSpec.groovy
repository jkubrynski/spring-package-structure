package com.kubrynski.blog.spring.service

import com.kubrynski.blog.spring.data.model.Client
import com.kubrynski.blog.spring.data.repo.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import spock.lang.Specification

import static org.mockito.BDDMockito.given

/**
 * @author Jakub Kubrynski
 */
@SpringApplicationConfiguration(classes = [ServiceConf])
class ClientServiceSpec extends Specification {

	@Autowired
	ClientService clientService

	@Autowired
	ClientRepository clientRepository

	def "should return users from repository"() {
		given:
			ArrayList<Client> expectedClientList = new ArrayList<Client>()
			given(clientRepository.findAll()).willReturn(expectedClientList)
		when:
			List<Client> listFromDb = clientService.getAllClients()
		then:
			listFromDb == expectedClientList
	}
}
