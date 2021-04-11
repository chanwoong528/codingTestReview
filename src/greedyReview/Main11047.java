package greedyReview;

import java.util.Scanner;

public class Main11047 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int total = sc.nextInt(); 
		int type[] = new int[n];
		for(int i = 0; i<n; i++ ) {
			type[i]= sc.nextInt();
			
		}
		
		
		System.out.println(n);
		System.out.println(total);
		int count = 0; 
		for(int i = type.length-1; i>=0; i-- ) {
			if(total/type[i]!=0) {
				int numCoin = (total/type[i]);
				total = total-(numCoin*type[i]);
				
				count= count+numCoin; 
			}
			if(total ==0) {
				break; 
			}
		}
		System.out.println(count);
		
	}

}
