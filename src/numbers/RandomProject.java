package numbers;

import java.util.Random;
public class RandomProject{
public static void main(String[] args){
Random generator = new Random(); //give a object name for the class
for(int i=0; i<=100; i++){
int randomNumbers = generator.nextInt(1000);//will generate numbers from1-20
System.out.println(randomNumbers);
}
}
}