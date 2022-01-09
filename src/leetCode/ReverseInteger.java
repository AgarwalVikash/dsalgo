package leetCode;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int x=1534236469;
		long output=0;
		int lastdigit=999;
		int count=0;
		while(x!=0) {
			lastdigit=x%10;
			x=x/10;
			output=output*10;
			if(output<Integer.MIN_VALUE||output>Integer.MAX_VALUE) {
				System.out.println(0);
				break;
			}else {
				output=output+lastdigit;
			}
			
		}
		System.out.println(output);
		System.out.println(count);
	}

}
