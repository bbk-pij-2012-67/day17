public class PaperSize{
	
	public static void main(String[] args){
		Dimensions p = findSize(args[0]);
		System.out.println("Size of " + args[0] + ": " + p.length + "mm X " + p.width + "mm");
	}
	
	public static Dimensions findSize(String size){
		
		if(size.equals("A0")){
			Dimensions dim = new Dimensions(1189,841);
			return dim;
		}else if(size.length()>2 && size.substring(1,2).equals("0")){
			return Dimensions.dble(findSize(size.substring(0,size.length()-1)));
		}else{
			int sizeNum = Integer.parseInt(size.substring(1,size.length()));
			//System.out.println(sizeNum);
			return Dimensions.half(findSize("A" + (sizeNum-1)));
		}
			
	}
	
	private static class Dimensions{
		public double length;
		public double width;
		
		public Dimensions(double length, double width){
			this.length = length;
			this.width = width;
			
		}
		
		public static Dimensions half(Dimensions dim){
			Dimensions myDim = new Dimensions(dim.width, dim.length/2);
			return myDim;
		}
		
		public static Dimensions dble(Dimensions dim){
			Dimensions myDim = new Dimensions(dim.width*2,dim.length);
			return myDim;
		}
				
	}
}
