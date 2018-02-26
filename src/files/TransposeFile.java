package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransposeFile {
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
			for(int j=0; j<list.size(); j++){
			String str = list.get(j).toString();
	        char ch[]=str.toCharArray();
	        if(i==0){
	        	out.write(ch[0]);
	        }
	        if(i==1){
	        	out.write(ch[1]);
	        }
	        if(i==2){
	        	out.write(ch[2]);
	        }
	        if(i==3){
	        	out.write(ch[3]);
	        }
	        if(i==4){
	        	out.write(ch[4]);
	        }
	        if(i==5){
	        	out.write(ch[5]);
	        }
	        if(i==6){
	        	out.write(ch[6]);
	        }
		   }
			out.write("\n");
		}
		 out.close();
	}

}
