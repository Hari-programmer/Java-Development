package com.CSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tesing {

	public static void main(String[] args) throws IOException  {
		
	ArrayList<String> storedata = new ArrayList<String>();
		
		String Path = "C:\\Users\\Hari\\Downloads\\samplerows (20).csv";
		
		String[] data1 = fetchColumn(14,Path,","); // Calling Method, here you con mention which column you want 
		
		for(int i =0; i<data1.length; i++) {
			
			String tempStr = data1[i].replaceAll("\"", "");
			int h=0,s=1;
			if ((h==i) ||(s==i)){
				System.out.println(tempStr+"\n");	
			} else {
				StringBuilder output = new StringBuilder();
				for(int j = 0; j < (tempStr.length()-1); j+=2) {
					
					String str = tempStr.substring(j, j+2);
					//System.out.println(str);
					output.append((char)Integer.parseInt(str, 16));
					System.out.print(output);
				
				}  
				System.out.println("\n");
				String outref = output.toString();
				storedata.add(outref);
				
			}	
		}
		AddColumn(storedata,Path,",",21);
		call();
	}
	
	
	public static void call() throws IOException {
		ArrayList<String> storedata1 = new ArrayList<String>();
		
		String Path = "C:\\Users\\Hari\\Downloads\\samplerows (20).csv";
		
		String[] data1 = fetchColumn1(13,Path,","); // Calling Method, here you con mention which column you want 
		
		for(int i =0; i<data1.length; i++) {
			
			String tempStr = data1[i].replaceAll("\"", "");
			int h=0,s=1;
			if ((h==i) ||(s==i)){
				System.out.println(tempStr+"\n");	
			} else {
				StringBuilder output = new StringBuilder();
				for(int j = 0; j < (tempStr.length()-1); j+=2) {
					
					String str = tempStr.substring(j, j+2);
					//System.out.println(str);
					output.append((char)Integer.parseInt(str, 16));
					System.out.print(output);
				
				}  
				System.out.println("\n");
				String outref = output.toString();
				storedata1.add(outref);
				
			}	
		}
		AddColumn1(storedata1,Path,",",22);	
		
	}
	
	public static String[] fetchColumn(int colPos,String path,String delimiter) throws IOException {
		String line;
		ArrayList<String> coldata = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(path));  
		while ((line = br.readLine()) != null)   {  
		String[] cols = line.split(delimiter); 
		coldata.add(cols[colPos]);	
		//System.out.println("Coulmn 1= " + cols[0] + " , Column 4=" + cols[3]+ " , Column 14=" + cols[13]+ " , Column 15=" + cols[14]);  
		} 
		System.out.println("\n Its working....😊😊😊");
		return coldata.toArray(new String[0]);  
	}
     
	
	public static List<String> AddColumn(ArrayList<String> storedata,String path,String delimiter,int colPos) throws IOException {
		
		List<String> data = Files.readAllLines(Paths.get(path));
		
		PrintWriter pw = new PrintWriter(path);
		
		FileWriter fw = new FileWriter(path,true);
	   
		pw =new PrintWriter(fw);
		
		for(int i=0; i<data.size(); i++) {
			String[] line = data.get(i).split(delimiter);
			List<String> record = new ArrayList<String>(Arrays.asList(line));
			
			int h =0;
			if (h==i) {
				String header= "Record1";
				record.add(colPos, header);
				pw.println(String.join(delimiter, record));
			}else{
			record.addAll(colPos, storedata);
			pw.println(String.join(delimiter, record));
			
		}
			
		}
		pw.close();
		System.out.println("\n Column Added.");
		
	return data;
	
	
}
	
	
	public static String[] fetchColumn1(int colPos,String path,String delimiter) throws IOException {
		String line;
		ArrayList<String> coldata = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(path));  
		while ((line = br.readLine()) != null)   {  
		String[] cols = line.split(delimiter); 
		coldata.add(cols[colPos]);	
		//System.out.println("Coulmn 1= " + cols[0] + " , Column 4=" + cols[3]+ " , Column 14=" + cols[13]+ " , Column 15=" + cols[14]);  
		} 
		System.out.println("\n Its working....😊😊😊");
		return coldata.toArray(new String[0]);  
	}
     
	
	public static List<String> AddColumn1(ArrayList<String> storedata1,String path,String delimiter,int colPos) throws IOException {
		
		List<String> data = Files.readAllLines(Paths.get(path));
		
		PrintWriter pw = new PrintWriter(path);
		
		FileWriter fw = new FileWriter(path,true);
	   
		pw =new PrintWriter(fw);
		
		for(int i=0; i<data.size(); i++) {
			String[] line = data.get(i).split(delimiter);
			List<String> record = new ArrayList<String>(Arrays.asList(line));
			
			int h =0;
			if (h==i) {
				String header= "Record2";
				record.add(colPos, header);
				pw.println(String.join(delimiter, record));
			}else{
			record.addAll(colPos, storedata1);
			pw.println(String.join(delimiter, record));
			
		}
			
		}
		pw.close();
		System.out.println("\n Column Added.");
		
	return data;
	
	
}
			

	
	
	
	
	
	
	
			
}
	

