package com.technoelevate.lms.repository.admin;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.technoelevate.lms.pojo.batch.Batch;

@Repository
public class AdminRepo {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("batch");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	Batch batch;
	
	public void saveBatch(Batch batch) {
		
		System.out.println(batch);
		transaction.begin();
		manager.persist(batch);
		
		transaction.commit();
	}
	
	public List<?> displayAll() {
		Query query = manager.createQuery("from Batch");
		List<Batch> resultList = query.getResultList();
		System.out.println(resultList);
		transaction.begin();
		transaction.commit();
		return resultList;
		
	}
	
	

}
