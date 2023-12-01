public class PrimeNumbers {
	public static void main (String[] args) {

	int number = 1 ;
	int counter = 0 ;

	while (counter <=1000) {
		int ans = number % 6 ;
			if (ans >= 1) {
				int answer = 6 * ans + 1 ;
				int answer2 = 6 * ans - 1;
				System.out.printf("%d %d ", answer2, answer) ;
				number += 1;
			}
		counter += 1;
	}

}

}