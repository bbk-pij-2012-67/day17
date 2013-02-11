//Recursion ex 1 (a).

public class RecursivePrint{
	public static void main(String[] args){
		System.out.println(RecursivePrint.mcCarthy91(61));
	}

	public static void printNumbers(int n) {
		if (n <= 0) {
			return;
		}
		System.out.println(n);
		printNumbers(n-2);
		printNumbers(n-3);
		System.out.println(n);
	}

	public static int mcCarthy91(int n) {
		System.out.println(n);
		if (n > 100) {
			
			return n - 10;
		} else {
			
			return mcCarthy91(mcCarthy91(n+11));
		}
	}
}
