package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MyCode{
public static void main(String[] args) throws FileNotFoundException {
Scanner in = new Scanner(new File("src/files/inputfile.txt"));
while(in.hasNext()){
	System.out.println("->"+in.next());
	for(int i=0; i<=in.next().length(); i++){
		
	}
}
String input = in.nextLine();
String input1=in.nextLine();

int i =0;
int j=0;

for(i = 0,j=0;i < input.length()||j<input1.length();i++,j++)
    {
    char letter = input.charAt(i);
    char letter1=input1.charAt(j);
    System.out.println(letter + " "+letter1);
    }
     }}