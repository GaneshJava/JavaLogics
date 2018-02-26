package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanFile {
	public static void main(String[] args) throws IOException {
		Scanner scaner = new Scanner(new File("src/files/inputfile.txt"));
		ArrayList list = new ArrayList();
		while (scaner.hasNextLine()) {
			String lineA = scaner.nextLine();
			lineA.length();
			list.add(lineA);
		} 
		FileOutputStream fout = new FileOutputStream("src/files/outputfile.txt");
		 OutputStreamWriter out = new OutputStreamWriter(fout);

		 for(int i=0; i<list.size(); i++){
			String str = list.get(i).toString();
	        char ch[]=str.toCharArray();
	        if(ch[i]!= 0){
	        	out.write(ch[0]);
	        }
	        if(ch[i]!= 0){
	        	out.write(ch[1]);
	        }
	        if(ch[i]!= 0){
	        	out.write(ch[2]);
	        }
	        if(ch[i]!= 0){
	        	out.write(ch[3]);
	        }
	        
		}
		 out.close();
	}

}
