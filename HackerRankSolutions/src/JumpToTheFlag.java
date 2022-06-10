import java.util.Scanner;

public class JumpToTheFlag {

	public static int jumps (int flagHeight, int bigJump) {
		
		//double x = Math.floor(flagHeight / bigJump);
		int x= flagHeight / bigJump;
		int y = flagHeight % bigJump;
		int totalJumps= x+y;
		
		return totalJumps;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int flagHeight= sc.nextInt();
		int bigJump= sc.nextInt();
		
		if(1<= flagHeight && flagHeight<=10 && 1 <= bigJump && bigJump <=10) {
		System.out.println(jumps(flagHeight, bigJump));
		}
		sc.close();
	}
}
