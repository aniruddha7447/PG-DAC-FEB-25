class Stars {
	public static void main(String[] args) {
		int row, numberOfStars;
		for (row = 1; row <= 10; row++) {
			for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
				System.out.print("*");
				}
			System.out.println(); // Go to next line
			}
		}
}