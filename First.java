package first;

public class First {

	public static void main(String[] args) {

		/*
		 * for (int row = 1; row <= 3; row++) { for (int coloum = 1; coloum <= 3;
		 * coloum++) { System.out.print(row * coloum); } System.out.println(); }
		 */
		for (int row = 1; row <= 5; row++) {
			for (int coloum = 1; coloum <= 5; coloum++) {
				if(coloum<=row)
				System.out.print("*");
			}
			System.out.println();
		}
		for (int row = 1; row <= 5; row++) {
			for (int coloum = 1; coloum <= 5; coloum++) {
				if(coloum>=row)
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
