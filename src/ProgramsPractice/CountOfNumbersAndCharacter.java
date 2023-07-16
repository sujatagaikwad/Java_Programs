package ProgramsPractice;

public class CountOfNumbersAndCharacter {

	public static void main(String[] args) {
		String a = "asdbSFGH$#@1546";

		int lower = 0;
		int upper = 0;
		int specChar = 0;
		int number = 0;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				lower++;
			} else if (a.charAt(i) > 'A' && a.charAt(i) < 'Z') {
				upper++;
			} else if (a.charAt(i) > '0' && a.charAt(i) < '9') {
				number++;
			} else {
				specChar++;
			}
		}
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(number);
		System.out.println(specChar);

	}

}
