public class Factorial{
	
	public static int iterFactorial(int n){
		int level = n;
		int result = 1;
		while(level > 0){
			result = result * level;
			level --;
		}
		return result;
	}
	
	public static int recurFactorial(int n){
		if(n == 1){
			return 1;
		}
		return n * recurFactorial(n-1);
	}
	
	public static void main(String[] args){
		
		System.out.println("(Iterative) 6! = " + iterFactorial(6));
		System.out.println("(Recursive) 6! = " + recurFactorial(6));
	}
}
