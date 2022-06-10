import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
        Set<Integer> list = new HashSet<Integer>();
        
        for (int i = 0; i < n; i++) {
              int num = sc.nextInt();
              list.add(num);
        }
        int count = 0;
        int k = sc.nextInt();
        for(int i :list) {
              for(int j:list) {
                    if(i+k==j) {
                          count++;
                    }
              }
        }
        System.out.println(count);
        sc.close();

}
}
