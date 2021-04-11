package greedyReview;

import java.util.Scanner;

public class Main13305 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int city[] = new int[n];
		int dis[] = new int[n - 1];

		for (int i = 0; i < dis.length; i++) {
			dis[i] = sc.nextInt();
		}
		for (int i = 0; i < city.length; i++) {
			city[i] = sc.nextInt();
		}
		int startCost = city[0];

		for (int i = 1; i < city.length; i++) {
			if (startCost < city[i]) {
				city[i] = startCost;
			} else {
				startCost = city[i];
			}
		}
		int totalCost = 0;
		for (int i = 0; i < dis.length; i++) {
			totalCost = totalCost + (dis[i] * city[i]);

		}

		System.out.println(totalCost);

	}

}
