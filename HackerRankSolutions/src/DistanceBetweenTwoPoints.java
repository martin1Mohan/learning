import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	static void distance3D(float x1, float y1, float z1, float x2, float y2, float z2) {

		double d = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2) * 1.0), 0.5);
		System.out.println("3D distance is " + Math.ceil(d));
	}

	static void distance2D(float x1, float y1, float x2, float y2) {

		double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
		System.out.println("2D distance is " + Math.ceil(d));
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float x1 = sc.nextFloat();
	    float y1 = sc.nextFloat();
	    float z1 = sc.nextFloat();
	    float x2 = sc.nextFloat();
	    float y2 = sc.nextFloat();
	    float z2 = sc.nextFloat();
	    
	    distance2D(x1, y1, x2, y2);
	    distance3D(x1, y1, z1, x2, y2, z2);
	    
	    sc.close();
	}
}
