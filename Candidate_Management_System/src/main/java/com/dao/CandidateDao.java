package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Candidate;

public class CandidateDao {
	public Candidate getallcandidate() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Candidate obj = session.load(Candidate.class, 1);
		return obj;
		
	}
    	public Candidate insertcandidate() {
    		Configuration cfg = new Configuration();
    		cfg.configure();
    		cfg.addAnnotatedClass(Candidate.class);
    		SessionFactory factory = cfg.buildSessionFactory();
    		Session session = factory.openSession();
    		Transaction tx = session.beginTransaction();
    		Candidate candidate = new Candidate(15,"Ram shinde","BJP","MH","karjat","male",45);
    		session.save(candidate);
    		tx.commit();
			return candidate;
    		
    	}
    	public Candidate updatecandidate() {
    		Configuration cfg = new Configuration();
    		cfg.configure();
    		cfg.addAnnotatedClass(Candidate.class);
    		SessionFactory factory = cfg.buildSessionFactory();
    		Session session = factory.openSession();
    		Transaction tx = session.beginTransaction();
    		Candidate candidate = new Candidate(11,"Devendra F","BJP","MH","karjat","male",45);
			session.update(candidate);
			tx.commit();
    		return candidate;
    		
}
    	public Candidate saveorupdatecandidate() {
    		Configuration cfg = new Configuration();
    		cfg.configure();
    		cfg.addAnnotatedClass(Candidate.class);
    		SessionFactory factory = cfg.buildSessionFactory();
    		Session session = factory.openSession();
    		Transaction tx = session.beginTransaction();
    		Candidate candidate = new Candidate(11,"Devendra F","BJP","MH","karjat","male",45);
			session.update(candidate);
			tx.commit();
    		return candidate;
    		
    	}
    	public Candidate deletecandidate() {
    		Configuration cfg = new Configuration();
    		cfg.configure();
    		cfg.addAnnotatedClass(Candidate.class);
    		SessionFactory factory = cfg.buildSessionFactory();
    		Session session = factory.openSession();
    		Transaction tx = session.beginTransaction();
    		Candidate candidate = new Candidate(13,"Ram Shinde","BJP","MH","karjat","male",45);
			session.delete(candidate);
    		tx.commit();
    		return candidate;
    	}
	
}
