package greedyReview;

import java.util.Arrays;
import java.util.Scanner;

public class Main11399 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int people[] = new int[n];
		int result[] = new int[n];
		for (int i = 0; i < n; i++) {
			people[i] = sc.nextInt();
		}
		Arrays.sort(people);
		int total = 0;
		for (int i = 0; i < n; i++) {
			total = total + people[i];
			result[i]= total; 

		}
		int sum= 0; 
		for(int i = 0; i< result.length; i++) {
			sum = sum+ result[i];
			
		}

		System.out.println(sum);
	}

}
