package com.Food_Delivery.entity;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class FoodEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	    private Long id;   
	    @Column(nullable = false)
	    private String name;
	    @Column(nullable = false)
	    private double price;
	    private String description;

	    public FoodEntity() {}
	    public FoodEntity(String name, double price, String description) {
	        this.name = name;
	        this.price = price;
	        this.description = description;
	    }
	    
	    
			
	    
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
}

