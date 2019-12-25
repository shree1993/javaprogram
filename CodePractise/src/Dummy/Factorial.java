package Dummy;

public class Factorial {

	public static int factRecursion(int n) {

		if (n == 1)
			return 1;
		return n * factRecursion(n - 1);

	}

	public static int factiterative(int n) {

		int total = 1;
		for (int i = 1; i <= n; i++)
			total *= i;
		return total;
	}

	public static void main(String args[]) {

		System.out.println(factRecursion(5));
		System.out.println(factiterative(5));
	}

}
