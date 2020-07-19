package com.epam.exceptions_and_logging;

public class AboveStandardMaterial {
	
	double area;
			
	public AboveStandardMaterial(double area) {
		this.area=area;
	}

	public double calculate() {
		return area*1500;
	}
	
}

