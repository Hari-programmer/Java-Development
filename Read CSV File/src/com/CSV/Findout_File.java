package com.CSV;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Findout_File {

	
	public static void main(String[] args) throws IOException {
	
		//String[] newdataclomn = {};
		String Path = "C:\\Users\\Hari\\Downloads\\samplerows.csv";
		extractClolumn(Path);
		
		String[] newdataclomn= {"MTFIN_Messages","{1:F01BSCHESM0AXXX5282519368}{2:O2991350220919TRCKCHZ0DVAL11643020662209191350N}{3:{111:001}{121:016ab768-9c10-40ac-9ebf-b941baa51200}}{4:"
				+ ":20:0919114926012483"
				+ ":21:20220916IAC1318"
				+ ":79://2209191149+0000"
				+ "//INVA/X004"
				+ "//TRCKCHZ0"
				+ "-}{5:{CHK:A5E69AD5F7C5}{TNG:}{S:{SAC:}{COP:P}}","{1:F01BSCHESM0AXXX5282519368}{2:O2991350220919TRCKCHZ0DVAL11643020662209191350N}{3:{111:001}{121:016ab768-9c10-40ac-9ebf-b941baa51200}}{4:"
						+ ":20:0919114926012483"
						+ ":21:20220916IAC1318"
						+ ":79://2209191149+0000"
						+ "//INVA/X004"
						+ "//TRCKCHZ0"
						+ "-}{5:{CHK:A5E69AD5F7C5}{TNG:}{S:{SAC:}{COP:P}}","{1:F01BSCHESM0AXXX5282519368}{2:O2991350220919TRCKCHZ0DVAL11643020662209191350N}{3:{111:001}{121:016ab768-9c10-40ac-9ebf-b941baa51200}}{4:"
								+ ":20:0919114926012483"
								+ ":21:20220916IAC1318"
								+ ":79://2209191149+0000"
								+ "//INVA/X004"
								+ "//TRCKCHZ0"
								+ "-}{5:{CHK:A5E69AD5F7C5}{TNG:}{S:{SAC:}{COP:P}}","{1:F01BSCHESM0AXXX5282519368}{2:O2991350220919TRCKCHZ0DVAL11643020662209191350N}{3:{111:001}{121:016ab768-9c10-40ac-9ebf-b941baa51200}}{4:"
										+ ":20:0919114926012483"
										+ ":21:20220916IAC1318"
										+ ":79://2209191149+0000"
										+ "//INVA/X004"
										+ "//TRCKCHZ0"
										+ "-}{5:{CHK:A5E69AD5F7C5}{TNG:}{S:{SAC:}{COP:P}}","{1:F01BSCHESM0AXXX5282519368}{2:O2991350220919TRCKCHZ0DVAL11643020662209191350N}{3:{111:001}{121:016ab768-9c10-40ac-9ebf-b941baa51200}}{4:"
												+ ":20:0919114926012483"
												+ ":21:20220916IAC1318"
												+ ":79://2209191149+0000"
												+ "//INVA/X004"
												+ "//TRCKCHZ0"
												+ "-}{5:{CHK:A5E69AD5F7C5}{TNG:}{S:{SAC:}{COP:P}}","{1:F01BSCHESM0AXXX5282519368}{2:O2991350220919TRCKCHZ0DVAL11643020662209191350N}{3:{111:001}{121:016ab768-9c10-40ac-9ebf-b941baa51200}}{4:"
														+ ":20:0919114926012483"
														+ ":21:20220916IAC1318"
														+ ":79://2209191149+0000"
														+ "//INVA/X004"
														+ "//TRCKCHZ0"
														+ "-}{5:{CHK:A5E69AD5F7C5}{TNG:}{S:{SAC:}{COP:P}}","{1:F01BSCHESM0AXXX5282519368}{2:O2991350220919TRCKCHZ0DVAL11643020662209191350N}{3:{111:001}{121:016ab768-9c10-40ac-9ebf-b941baa51200}}{4:"
																+ ":20:0919114926012483"
																+ ":21:20220916IAC1318"
																+ ":79://2209191149+0000"
																+ "//INVA/X004"
																+ "//TRCKCHZ0"
																+ "-}{5:{CHK:A5E69AD5F7C5}{TNG:}{S:{SAC:}{COP:P}}","{1:F01BSCHESM0AXXX5282519368}{2:O2991350220919TRCKCHZ0DVAL11643020662209191350N}{3:{111:001}{121:016ab768-9c10-40ac-9ebf-b941baa51200}}{4:"
																		+ ":20:0919114926012483"
																		+ ":21:20220916IAC1318"
																		+ ":79://2209191149+0000"
																		+ "//INVA/X004"
																		+ "//TRCKCHZ0"
																		+ "-}{5:{CHK:A5E69AD5F7C5}{TNG:}{S:{SAC:}{COP:P}}"};
		
		
		//String Path1 = "C:\\Users\\Hari\\Documents\\javaOut.csv";
		AddColumn(newdataclomn,Path,",",21);
		
	}
	public static void AddColumn(String[] newclo,String path,String delimiter,int colPos) {
		
		try {
			
			List<String> data = Files.readAllLines(Paths.get(path));
			
			PrintWriter pw = new PrintWriter(path);
			
			FileWriter fw = new FileWriter(path,true);
			pw =new PrintWriter(fw);
			
			for(int i=0; i<data.size(); i++) {
				String[] line = data.get(i).split(delimiter);
				List<String> record = new ArrayList<String>(Arrays.asList(line));
				record.add(colPos, newclo[i]);
				pw.println(String.join(delimiter, record));
			}
			
			pw.close();
			System.out.println("\n Column Added.");
			
		} catch (Exception e) {	
		}
		
		
	}
		
	public static void extractClolumn(String Path) throws IOException  {
		
		String line = "";  
		String splitBy = ","; 
		BufferedReader br = new BufferedReader(new FileReader(Path)); 
		
		//PrintStream consol = new PrintStream("C:\\Users\\Hari\\Documents\\javaOut.csv"); //To Store Output data In File
		//System.setOut(consol); 
		while ((line = br.readLine()) != null){  
		String[] cols = line.split(splitBy);
		System.out.println("Coulmn 1= " + cols[0] + " , Column 4=" + cols[3]+ " , Column 14=" + cols[13]+ " , Column 15=" + cols[14]);  
		//consol.print("\n"+"Coulmn 1= " + cols[0] + " , Column 4=" + cols[3]+ " , Column 14=" + cols[13]+ " , Column 15=" + cols[14] );
		} 
		}   
		
		//System.out.println("\n Its working....😊😊😊");
		
	}
		
		
		
		
		
		/*
		String Ref = "C:\\Users\\Hari\\Downloads\\samplerows.csv";
		
			try {
				Scanner sc  = new Scanner(new File(Ref));
				while (sc.hasNext()) {
				      System.out.print(sc.next());
				    }
				    sc.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		*/	
		
	



