package com.epam.exceptions_and_logging;

public class StandardMaterial {
	
	double area;
	
	public StandardMaterial(double area) {
		this.area=area;
	}

	public double calculate() {
		return area*1200;
	}
}
