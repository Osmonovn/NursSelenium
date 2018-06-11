package nurs;

import java.util.Random;

public class hi {
	public static void main(String[] args) {
		Random s= new Random();
		
		String zip="4";
		for(int i=0;i<14;i++) {
			zip= zip+s.nextInt(10);
		}
		System.out.print(zip);
	}

}
