package com.kubrynski.blog.spring.data.repo

import com.kubrynski.blog.spring.AutoConfigCarrier
import com.kubrynski.blog.spring.data.DataConf
import com.kubrynski.blog.spring.data.model.Client
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import spock.lang.Specification

/**
 * @author Jakub Kubrynski
 */
@SpringApplicationConfiguration(classes = [DataConf, AutoConfigCarrier])
class ClientRepositorySpec extends Specification {

	@Autowired
	ClientRepository clientRepository

	def "should validate very complex query"() {
		given:
			clientRepository.save(new Client("Jerry"))
		when:
			Client clientFromDb = clientRepository.findByUsername("Jerry")
		then:
			clientFromDb.username == "Jerry"
	}
}
