package Dummy;

class Fibb {

	public int fib(int n) {
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}
	
	public boolean palindrome(int num) {
		int origionalnum = num;
		int rem = 0;
		while(num > 0) {
			rem = rem * 10 + num %10;
			num = num/10;
		}
		
		if(origionalnum != rem)
			return false;
		
		return true;
	}
}

public class Fibonacciseries {

	public static void main(String args[]) {
		Fibb fi = new Fibb();
		System.out.println(fi.fib(7));
		System.out.println(fi.palindrome(12321));
		
	}

}
