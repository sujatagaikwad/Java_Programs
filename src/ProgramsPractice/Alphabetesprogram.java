package ProgramsPractice;

public class Alphabetesprogram {
	public static void main(String args[]) {
		// int n=4;
		int alpha = 65;

		for (int i = 0; i <= 4; i++) { // outer loop

			for (int j = 0; j <= i; j++) { // inner loop

				System.out.print((char) (alpha + j) + " ");
			}
			System.out.println("");
		}
	}

}
