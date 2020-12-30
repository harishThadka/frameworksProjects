package com.bandiClasses.ParametersDemo.Models;

public class Dog {

	private int dogId;
	private String dogName;
	private String dogBreed;
	
	public int getDogId() {
		return dogId;
	}
	public void setDogId(int dogId) {
		this.dogId = dogId;
	}
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public String getDogBreed() {
		return dogBreed;
	}
	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}
	
	@Override
	public String toString() {
		return "Dog [dogId=" + dogId + ", dogName=" + dogName + ", dogBreed=" + dogBreed + "]";
	}
	
	
}
