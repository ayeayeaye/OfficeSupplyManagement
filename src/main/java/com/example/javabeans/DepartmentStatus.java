package com.example.javabeans;

public enum DepartmentStatus {
	REQUEST, APPROVE, REJECT;
	
	public String toString() {
		return name().charAt(0) + name().substring(1).toLowerCase();
	}
}
