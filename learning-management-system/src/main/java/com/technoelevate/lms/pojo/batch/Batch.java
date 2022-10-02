package com.technoelevate.lms.pojo.batch;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity @Table(name = "Batches")
@Component
public class Batch {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long batchNo;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String batchId;
	private String name;
	private String mentor;
	//private List technologies;
	private String startDate;
	private String endDate;
	private String status;

}
