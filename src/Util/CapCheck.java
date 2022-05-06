package Util;


import java.util.*;
import Model.*;

public class CapCheck {
	private static CapCheck capcheck = null;
	static HashMap<String, items> items = new HashMap<String, items>();
	static HashMap<String,Integer> capacityforCategory = new HashMap<String,Integer>();
	private CapCheck() {
		capacityforCategory.put("Essentials",10);
		capacityforCategory.put("Luxury",10);
		capacityforCategory.put("Misc",10);
		
	}

	public static CapCheck getInstance() {
		if (capcheck != null)
			return capcheck;
		else {
			capcheck = new CapCheck();
			return capcheck;
		}
	}

}

