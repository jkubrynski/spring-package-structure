package com.kubrynski.blog.spring.rest

import com.kubrynski.blog.spring.data.model.Client
import com.kubrynski.blog.spring.service.ClientService
import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.mock.web.MockHttpServletResponse
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.ResultActions
import org.springframework.web.context.WebApplicationContext
import spock.lang.Specification

import static org.mockito.BDDMockito.given
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup

/**
 * @author Jakub Kubrynski
 */
@SpringApplicationConfiguration(classes = [RestConf])
@WebAppConfiguration
class ClientControllerSpec extends Specification {

	@Autowired
	WebApplicationContext applicationContext

	@Autowired
	ClientService clientService

	MockMvc mockMvc

	void setup() {
		mockMvc = webAppContextSetup(applicationContext).build()
	}

	def "should return clients list"() {
		given:
			def clients = new ArrayList<Client>()
			clients.add(new Client("Jerry"))
			given(clientService.getAllClients()).willReturn(clients)
			ResultActions actions = mockMvc.perform(get('/clients'))
		when:
			MockHttpServletResponse response = actions.andReturn().response
		then:
			response.status == 200
		and:
			def jsonBody = new JsonSlurper().parseText(response.contentAsString)
			jsonBody.size == 1
			jsonBody[0].username == "Jerry"
	}
}
