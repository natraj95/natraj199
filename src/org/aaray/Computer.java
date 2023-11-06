package org.aaray;

public class Computer {
public static void main(String[] args) {
	int [] a= new int[10];
	//data type array ref name =new datatype array [size];
  //here size is 10 but we have given value only upto 4 so it compiles only upto 4 and for the rest
	// it types default value of given data type .. here we used integer data type its def value is 0
	//hence it compiles 0 for the rest of the values..
	 a[0]=20;
     a[1]=20;
     a[2]=30;
     a[3]=99;
     a[4]=100;
      
     for(int i=0; i<a.length; i++){
         System.out.println(a[i]);
         //this is for loop
     }
     System.out.println("----------");
     
     for (Integer b:a){
    	 
    	 
    	 System.out.println(b);
  //enhanced for loop
 //for enhanced loop type variable name from reverse (Class of integer new variable:old variable){
 
   // in for loop we can change the value eg: for (int i=3;i<a.length;i++)
 //but for enhanced loop we cant change the value it always compiles fully from i=0;
     }
}	
}
     
   
     
     
     

