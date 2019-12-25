package Dummy;
class Fact{
	
	public int factRecursion(int n) {
		
		if(n ==1) 
			return 1;
		return n * factRecursion(n-1);
		
	}
	
	public int factiterative(int n) {
		
		int total = 1;
		for(int i = 1 ;i <= n ; i++)
			total *= i;
		return total;
	}
	
}
