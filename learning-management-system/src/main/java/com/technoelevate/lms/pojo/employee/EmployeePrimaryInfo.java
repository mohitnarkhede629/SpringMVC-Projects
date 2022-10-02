package com.technoelevate.lms.pojo.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "employee_primary_Info")
public class EmployeePrimaryInfo {
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY )
	private String employeeId;
	private String employeeName;
	@DateTimeFormat
	private String dateOfJoining;
	@DateTimeFormat
	private String dateOfBirth;
	private String emailId;
	private String bloodGroup;
	private String designation;
	private String gender;
	private String nationality;
	private String employeeStatus;
}
