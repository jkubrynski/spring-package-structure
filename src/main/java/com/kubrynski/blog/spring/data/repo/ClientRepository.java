package com.kubrynski.blog.spring.data.repo;

import com.kubrynski.blog.spring.data.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jakub Kubrynski
 */
public interface ClientRepository extends JpaRepository<Client, Long> {

	Client findByUsername(String username);

}
