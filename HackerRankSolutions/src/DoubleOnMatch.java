import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class DoubleOnMatch {

	static int findValue(HashSet<Integer> arr, int n, int k)
    {
 
        for (Iterator<Integer> iterator = arr.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if(integer == k) {
				k*=2;
			}
		}
 
        return k;
    }
 
	public static void main(String[] args)
    {
    	Scanner sc= new Scanner(System.in);
    	int n= sc.nextInt();
    	HashSet<Integer> arr= new HashSet<Integer>();
    	for (int i = 0; i < n; i++) {
			int temp= sc.nextInt();
			arr.add(temp);
		}
    	
        int k= sc.nextInt();

        System.out.print(findValue(arr, n, k));
        sc.close();
    }
}
