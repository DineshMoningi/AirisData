package com.airisdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="STUDENT")
@Getter
@Setter
@Data
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int age;
	private String gender;
	private String course;
	
}
