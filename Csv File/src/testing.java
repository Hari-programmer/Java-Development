import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
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

import com.opencsv.CSVWriter;

public class testing {

public static void main(String[] args) throws IOException {
		
		ArrayList<String> storedata = new ArrayList<String>();
		
		String Path = "C:\\Users\\Hari\\Downloads\\samplerows (19).csv";
		
		String[] data1 = fetchColumn(14,Path,",",13); // Calling Method, here you con mention which column you want 
		
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
	}
	
	public static String[] fetchColumn(int colPos,String path,String delimiter,int compos) throws IOException {
		String line;
		ArrayList<String> coldata = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(path));  
		while ((line = br.readLine()) != null)   {  
		String[] cols = line.split(delimiter); 
		coldata.add(cols[colPos]);
		coldata.add(cols[compos]);
		
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
		int k=1;
		for(int i=0; i<data.size(); i++) {
			String[] line = data.get(i).split(delimiter);
			List<String> record = new ArrayList<String>(Arrays.asList(line));
			
			int h =0;
			if (h==i) {
				String header= "Record1";
				record.add(colPos, header);
				pw.println(String.join(delimiter, record));
			}else if(k==i) {
			record.addAll(colPos, storedata);
			pw.println(String.join(delimiter, record));
			k+=2;
			i+=1;
		}
			
		}
		pw.close();
		System.out.println("\n Column Added.");
		
	return data;
	
	
}
   
}
