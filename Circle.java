import java.util.Random;
public class Circle {
	public static boolean inside(double x1, double y1) {
		double distance = Math.sqrt((x1 * x1) + (y1 * y1));
		return(distance < 1.0);
	}
	public static double compute(int numRepeats) {
		Random gen = new Random(System.currentTimeMillis());
		int repeat = 0;
		double PI = 0;
		for(int i = 1; i <= numRepeats; i++) {
			double x1 = (gen.nextDouble()) * 2 - 1.0;
			double y1 = (gen.nextDouble()) * 2 - 1.0;
			if(inside(x1, y1)) {
				repeat++;
			}
		}
		double dRepeat = numRepeats;
		PI = (4.0 * (repeat/dRepeat));
		return PI;
	}
	public static void main(String[] args) {
		int numRepeats = 5;
		double PI = compute(numRepeats);
		System.out.println ("Computed PI = " + PI);  
	}
}
