package com.ritikkanswal.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ritikkanswal.springboot.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
	
	
	
}
