package com.epam.exceptions_and_logging;

public class HighStandardMaterialFullyAutomated {
	
	double area;
	
	public HighStandardMaterialFullyAutomated(double area) {
		this.area=area;
	}

	public double calculate() {
		return area*2500;
	}
	
}
