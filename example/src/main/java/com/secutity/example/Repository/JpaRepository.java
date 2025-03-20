package com.secutity.example.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class JpaRepository {

	@Autowired
	EntityManager em;
	
	public void run() {
		em.re
	}
}
