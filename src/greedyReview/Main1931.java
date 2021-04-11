package greedyReview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] meeting = new int[n][2];
		for (int i = 0; i < n; i++) {
			meeting[i][0] = sc.nextInt();//start time
			meeting[i][1] = sc.nextInt();//end time
		}
		Arrays.sort(meeting, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0]; //asc based on starting time if the endtime is same; 
				}
				return o1[1]-o2[1]; //asc
			}
			
			
			
		});
		int tempEnd = meeting[0][1];
		int count = 1; 
		for (int i = 1; i < n; i++) {
			if(tempEnd <= meeting[i][0]) {
				count++; 
				tempEnd = meeting[i][1];
				
			}
		}		
		System.out.println(count);

	}

}
