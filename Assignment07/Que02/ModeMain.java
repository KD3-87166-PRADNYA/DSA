package question4;

import java.util.Scanner;

public class ModeMain {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		for(int i =0; i<arr.length;i++)
				arr[i] = sc.nextInt();
		int ans = Mode.modeOfArray(arr);
		System.out.println(ans);
	}
}
