package com.kubrynski.blog.spring.data.model

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author Jakub Kubrynski
 */
class ClientSpec extends Specification {

	@Unroll("For #newUsername expected result to be #expectedResult")
	def "should do very important username validation"() {
		given:
			Client client = new Client()
		when:
			boolean result = client.changeUsername(newUsername)
		then:
			result == expectedResult
		where:
			newUsername | expectedResult
			""          | false
			"   "       | false
			"Jerry"     | true
	}
}
