package Util;

import java.util.*;

import Interface.FilesRead;

import java.io.*; 


public class InputReader implements FilesRead{
static List<List<String>> inputList =  new ArrayList<>();
	
	public void Fileread(String filePath) {
		String line = "";
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			br.readLine();
			while ((line = br.readLine()) != null)
			{
				String[] data = line.split(",");
				ArrayList<String> list = new ArrayList<String>();
				list.add(data[0]);
				list.add(data[1]);
				list.add(data[2]);
				if(!CardReader.cards.contains(data[2])) {
					//System.out.println("inserting the new card details");
				CardReader.cards.add(data[2]);
				
				}
				inputList.add(list);

			}
            br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}