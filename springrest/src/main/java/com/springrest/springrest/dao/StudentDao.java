package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.springrest.entities.*;

public interface StudentDao extends JpaRepository<Students, Long>{
	
}
