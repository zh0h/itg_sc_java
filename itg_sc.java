import java.util.Scanner;

public class ItgScore {
    public static void main(String args[]) {
		
		int fant = 5;
		int ex = 4;
		int gr = 2;
		int dc = 0;
		int woff = -6;
		int miss = -12;
		int yh = 5;
		int bad = 0;
		int mn = -6;
		
		Scanner scInput = new Scanner(System.in);  
		
		System.out.println("Enter Fantastics: ");
		int urFant = scInput.nextInt();
		
		System.out.println("Enter Excellents: ");
		int urEx = scInput.nextInt();
		
		System.out.println("Enter Greats: ");
		int urGr = scInput.nextInt();
		
		System.out.println("Enter Decents: ");
		int urDc = scInput.nextInt();
		
		System.out.println("Enter Way Offs: ");
		int urWoff = scInput.nextInt();
		
		System.out.println("How many Misses?");
		int urMiss = scInput.nextInt();
		
		System.out.println("How many Yeah?");
		int urYh = scInput.nextInt();
		
		System.out.println("How many Bads?");
		int urBad = scInput.nextInt();
		
		System.out.println("How many mines explode?");
		int urMn = scInput.nextInt();
		
		int score = (urFant * fant) + (urEx * ex) + (urGr * gr) + (urDc * dc) + (urWoff * woff) + (urMiss * miss) + (urYh * yh) + (urBad * bad) + (urMn * mn);


		int total_step = urFant + urEx + urGr + urDc + urWoff + urMiss + urYh + urBad;
		
		int max_sc = fant * total_step;
		
		double urScore = score / (double) max_sc * 100;
		
		String finalScore = String.format("%.2f",urScore);
		
		System.out.println("Your score is " + finalScore);

	}
}