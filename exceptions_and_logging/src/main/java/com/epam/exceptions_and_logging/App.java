package com.epam.exceptions_and_logging;
import java.util.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    
	public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
		
    	System.out.println("enter total area");
    	double area=scanner.nextDouble();
        
    	System.out.println("enter type of standard\n1)standard_material\n2)above_standard_material\n3)high_standard\n4)high&fullyautomated");
        int choice=scanner.nextInt();
        
        switch(choice) {
        
	        case 1:StandardMaterial SM=new StandardMaterial(area);
	        	   LOGGER.info("Simple interest ="+SM.calculate());
	        	   break;
	        		
	        case 3:HighStandardMaterial HSM=new HighStandardMaterial(area);
	        	   LOGGER.info("Total cost ="+HSM.calculate());
				   break;
	        case 2:AboveStandardMaterial ASM=new AboveStandardMaterial(area);
	        	   LOGGER.info("Total cost ="+ASM.calculate());
	 	   		   break;
	        case 4:HighStandardMaterialFullyAutomated HSMF=new HighStandardMaterialFullyAutomated(area);
	        	   LOGGER.info("Total cost ="+HSMF.calculate());
				   break;
			default:LOGGER.error("enter valid type in range 1 to 4");
					break;
					
        }
        scanner.close();
    }
}
