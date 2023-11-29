import java.io.BufferedReader;
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

public class StoreData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

String Path ="C:\\Users\\Hari\\Downloads\\samplerows (1).csv";
		
		String[] data = FetchColumn(14,Path,","); // Calling Method, here you con mention which column you want 
		
		PrintStream consol = new PrintStream("C:\\Users\\Hari\\Documents\\javaOut.csv"); //To Store Output data In File
		System.setOut(consol);
		//ArrayList<String> storedata = new ArrayList<String>();
		
		for(int i =0; i<data.length; i++) {
			String TempStr = data[i].replaceAll("\"", "");
			int h=0;
			if (h==i) {
				consol.print(data[i]+"\n");
				//System.out.println(data[i]);
				
			} else {
				for(int j = 0 ; j < (TempStr.length()-1); j+=2) {
					StringBuilder output = new StringBuilder();
					String str = TempStr.substring(j, j+2);
					//System.out.println(str);
					//output.append((char)Integer.parseInt(str, 16));
				    output.append((char)Integer.parseInt(str, 16));
				    
					//System.out.println(output+"\n");
					
				   
				    consol.print(output);
					
				}
				//System.out.println();
				consol.print("\n");
			}
		}
		 
		String strbuiRef = consol.toString(); 
		 String[] storedata = strbuiRef.split(",");
		
		 AddColumn(storedata,Path,",",24);
		
		//String conref = consol.toString();
		//String[] newcol = conref.split("");
		//String strbuil = output.toString();
		//String[] newcol = strbuil.split(""); 
		//String[] newclo = strbuil;
		//AddColumn(storedata,Path,",",21);
		
	}
public static String[] FetchColumn(int colPos,String path,String delimiter) throws IOException {
	String line;
	ArrayList<String> coldata = new ArrayList<String>();
	BufferedReader br = new BufferedReader(new FileReader(path));  
	while ((line = br.readLine()) != null)   {  
	String[] cols = line.split(delimiter); 
	coldata.add(cols[colPos]);
	//coldata.add(cols[compos]);
	//System.out.println("Coulmn 1= " + cols[0] + " , Column 4=" + cols[3]+ " , Column 14=" + cols[13]+ " , Column 15=" + cols[14]);  
	} 
	System.out.println("\n Its working....😊😊😊");
	return coldata.toArray(new String[0]);  
}

public static List<String> AddColumn(String[] newclo,String path,String delimiter,int colPos) throws IOException {
	
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
		
	return data;
	
	
}

}
