package Util;

import java.util.*;

import Interface.Handler;
import Model.items;

import java.io.*; 

public class ValidateQuantity implements Handler{
	private Handler nextStep;
	public void setHandler(Handler nextHandler) {
		this.nextStep = nextHandler;
	}
	
	public void check(String filePath) {
		// Reading the Dataset file
		DataRead  read = new DataRead();
		read.Fileread("/Users/admin/Desktop/CMPE202/individual-project-preethibilla/src/resources/Dataset.csv");
		HashMap<String, items> dbitems = read.items;
		
		// Reading the Input file
		InputReader r1 = new InputReader();
		r1.Fileread(filePath);
		List<List<String>> inputdata = r1.inputList;

		boolean flag=false;
		boolean essentialflag=false;
		boolean luxuryflag=false;
		boolean miscflag=false;
		String lowQuantflag="";
		
		//Fetching the cap details for all categories
		CapCheck cap = CapCheck.getInstance();
		HashMap<String, Integer> category = cap.capacityforCategory;
		int essentials = category.get("Essentials");
		int luxury = category.get("Luxury");
		int misc = category.get("Misc");
		int essentialstotal = 0;
		int luxurytotal = 0;
		int misctotal = 0;
		
		for (List<String> item: inputdata) {
			int quantity = Integer.parseInt(item.get(1));
			String itemName = item.get(0);
			String cardNumber = item.get(2);
			
			//Validating the Quantities 
			if(dbitems.get(itemName).quantity<quantity) {
				flag= true;
				lowQuantflag+= "Quantity is invalid for "+itemName+" "+ item.get(1)+"\n";
			}
			
			//validating the cap for categories
			switch(dbitems.get(itemName).category) {
			case "Essentials":

				essentialstotal = essentialstotal + quantity;
				
				if(essentialstotal>essentials) {
					flag=true;
					essentialflag=true;
				}
				break;
				
			case "Luxury":

				luxurytotal = luxurytotal + quantity;
				
				if(luxurytotal>luxury) {
					flag=true;
					luxuryflag=true;
				}
				break;
				
			case "Misc":
			
				misctotal = misctotal + quantity;
				
				if(misctotal>misc) {
					flag=true;
					miscflag=true;
				}
				break;
			default:
				break;
			}
		}
		
		if(flag) {
			try {
			      FileWriter myWriter = new FileWriter("errors.txt");
			      myWriter.write("Please Correct the quantities "+ "\n");
			      myWriter.write(lowQuantflag);
			      if(lowQuantflag.equals("")) {
			    	  if(essentialflag)
			    	  myWriter.write("Number of items entered for Essentials are out of capacity"+ "\n");
			    	  if(luxuryflag)
				    	  myWriter.write("Number of items entered for Luxury are out of capacity"+ "\n");
			    	  if(miscflag)
				    	  myWriter.write("Number of items entered for Misc are out of capacity"+ "\n");
			      }
			      myWriter.close();
			      System.out.println("Payment is incomplete due to incorrect Quantities, check the error.txt file");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			return;
		}

		nextStep.check(filePath);
		
	}


}
