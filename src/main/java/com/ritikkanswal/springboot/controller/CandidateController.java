package com.ritikkanswal.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritikkanswal.springboot.model.Candidate;
import com.ritikkanswal.springboot.repository.CandidateRepository;

@RestController
@RequestMapping("/api/v1/")
public class CandidateController {
	
	@Autowired
	private CandidateRepository candidateRepository;
	
	// get all candidates
	@GetMapping("/candidates")
	public List<Candidate>getAllCandidates(){
		return candidateRepository.findAll();
	}
	
	

}
