package com.my.test.tcManager.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
	
	 @Id
	 @GeneratedValue
	 private Long id;
	 
	 private String name;

}