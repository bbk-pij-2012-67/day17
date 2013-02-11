public class Fibonacci{

	private static Integer[] memo;
	private static boolean memoInitiated = false;

	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = fib(n-1) + fib(n-2);
			return result;
		}
	}

	public static int fibIt(int n){
		int result=1;
		int prevResult = 0;
		for(int c = 2;c <= n;c++){
			int temp = result;
			result = result + prevResult;
			prevResult = temp;
		}
		return result;

	}

	public static void main(String[] args){
		System.out.println("46th Fibonacci number (recursive): " + fib(46));
		System.out.println("46th Fibonacci number (memoization): " + fibM(46));
	}

	public static int fibM(int n) {

		if(!memoInitiated){
			memoInitiated = true;
			memo = new Integer[n+1];
			for(int c=1;c<n+1;c++){
				memo[c] = -1;
			}
			if(n>2){
				memo[1] = 1;
				memo[2] = 1;
			}
		}
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			if(memo[n] != -1){
				return memo[n];
			}else{
				int result = fibM(n-1) + fibM(n-2);
				memo[n] = result;
				return result;
			}
		}
	}


}


