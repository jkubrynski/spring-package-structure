package com.kubrynski.blog.spring.data.model;

import org.springframework.util.StringUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Jakub Kubrynski
 */
@Entity
public class Client {

	@Id
	@GeneratedValue
	private Long id;

	private String username;

	Client() {
	}

	public Client(String username) {
		this.username = username;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public boolean changeUsername(String newUsername) {
		if (isValidBusinessValue(newUsername)) {
			username = newUsername;
			return true;
		} else {
			return false;
		}
	}

	private boolean isValidBusinessValue(String newUsername) {
		return StringUtils.hasText(newUsername);
	}
}
