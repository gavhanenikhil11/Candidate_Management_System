package com.controller;

import com.entity.Candidate;
import com.service.CandidateService;

public class CandidateController {
	CandidateService service =null;
	public Candidate getallcandidate() {
		 service = new CandidateService();
		Candidate getall = service.getallcandidate();
		return getall;
	
	}
	public Candidate insertcandidate() {
		Candidate insert = service.insertcandidate();
		return insert;
		
	}
	public Candidate updatecandidate() {
		Candidate update = service.updatecandidate();
		return update;
		
		
	}
	public Candidate saveorupdatecandidate() {
		Candidate saveorupdate = service.saveorupdatecandidate();
		return saveorupdate;

	}
	public Candidate deletecandidate() {
		Candidate delete = service.deletecandidate();
		return delete;
		
	}
}
