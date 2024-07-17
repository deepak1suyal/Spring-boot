package com.web.webapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployReposetry extends JpaRepository<EmployEntity, Long>{

} 