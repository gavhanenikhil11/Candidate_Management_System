package com.client;

import com.controller.CandidateController;
import com.entity.Candidate;

public class TestCandidate {
	public static void main(String[] args) {
		CandidateController controller = new CandidateController();
		Candidate getall = controller.getallcandidate();
		System.out.println(getall);
		
		Candidate insert = controller.insertcandidate();
		System.out.println(insert);
		Candidate update = controller.updatecandidate();
		System.out.println(update);
		Candidate saveorupdate = controller.saveorupdatecandidate();
		System.out.println(saveorupdate);
		Candidate delete = controller.deletecandidate();
		System.out.println(delete);
		
	}
	

}
