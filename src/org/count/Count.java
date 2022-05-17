package org.count;

public class Count {

	public static void main(String[] args) {
		int even=0;
		for ( int i=1;i<=100;i++) {
			if(i%2==0) {
				even++;
			}
		}
System.out.println("Count of a even numbers between 1 to 100 is "+even);
	}

}
