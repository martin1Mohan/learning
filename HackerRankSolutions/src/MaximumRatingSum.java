import java.util.Scanner;

public class MaximumRatingSum {

	static int maximumSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]= sc.nextInt();
		}
		if(1 <= n && n <= 10 ) {
		System.out.println(maximumSum(arr));
		}
		sc.close();
	}
}
