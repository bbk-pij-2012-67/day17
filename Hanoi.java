import java.util.Stack;

public class Hanoi{
	
	private Stack<Integer> towerA = new Stack<>();
	private Stack<Integer> towerB = new Stack<>();
	private Stack<Integer> towerC = new Stack<>();
	
	private int steps = 0;
	private int size = 0;
	
	private void initializeStack(int size){
		this.size = size;
		for(int c = size;c>=1;c--){
			towerA.push(c);
		}
		//System.out.println(towerA.toString());
	}
	
	
	
	public void moveDisks(int n, Stack<Integer> src, Stack<Integer> dest, Stack<Integer> free){
		if(n==1){
			dest.push(src.pop());
			steps++;
			printStage();
		}else{
			moveDisks(n-1,src,free,dest);
			dest.push(src.pop());
			printStage();
			steps++;
			moveDisks(n-1,free,dest,src);
		}
		
		
	}
	
	public Stack<Integer> getTowerA(){
		return towerA;
	}
	
	public Stack<Integer> getTowerB(){
		return towerB;
	}
	
	public Stack<Integer> getTowerC(){
		return towerC;
	}
	
	
	public static void main(String[] args){
		Hanoi hn = new Hanoi();
		
		hn.launch();
		
	}
	
	public void printStage(){
		System.out.println("Tower A: " + (getTowerA()).toString());
		System.out.println("Tower B: " + (getTowerB()).toString());
		System.out.println("Tower C: " + (getTowerC()).toString() + "\n");
	}
	
	public void launch(){
		initializeStack(64);
		System.out.println("Initial:");
		printStage();
		moveDisks(this.size,towerA,towerC,towerB);
		System.out.println("Steps: " + steps);
	}
}
		
