package com.service;

import com.dao.CandidateDao;
import com.entity.Candidate;

public class CandidateService {
	CandidateDao dao=null;
	public Candidate getallcandidate() {
		 dao = new CandidateDao();
		Candidate getall = dao.getallcandidate();
		return getall;
		
	
	}
	public Candidate insertcandidate() {
		Candidate insert = dao.insertcandidate();
		return insert;
		
	}
	public Candidate updatecandidate() {
		Candidate update = dao.updatecandidate();
		return update;
		
	}
	public Candidate saveorupdatecandidate() {
		Candidate saveorupdate = dao.saveorupdatecandidate();
		return saveorupdate;
	}
	public Candidate deletecandidate() {
		Candidate delete = dao.deletecandidate();
		return delete;
		
		
	}
	

}
