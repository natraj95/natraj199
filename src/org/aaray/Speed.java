package org.aaray;

public class Speed {
	public static void main(String[] args) {
	int [] a= new int [7];
	  //here size is 7 .. array is index based so only upto 6 can be done 
	a[0]=12;
	a[1]=23;
	a[2]=34;
	a[3]=45;
	a[4]=56;
	a[5]=67;
	a[6]=78;
	 
	for (int i=3; i<a.length;i++){
		System.out.println(a[i]);
	}
	System.out.println("-------");
	
	for (Integer b:a){
		System.out.println(b);
	}
	
	
	}	
	
	
	

}
