package greedyReview;

import java.util.Scanner;

public class Main2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int total = sc.nextInt(); 
		int count= 0; 
		while(true) {
			if(total%5==0) {
				count = count +(total/5);
				break; 
			}
			else {
				total= total -3; 
				count++; 
				
			}
		
			if(total<0) {
				count =-1; 
				break;
			}
			
			
		}
		System.out.println(count);
	
		
	}

}
