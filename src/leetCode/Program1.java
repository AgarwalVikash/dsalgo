package leetCode;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { -1, 3, 4, 6, 7, 8,9 };
		int target = 6;
		int left = 0;
		int right = nums.length - 1;
		int output = -1;
		boolean breaker=true;
		while (breaker) {
			if (target == nums[left+(right-left)/2]) {
				output = left+(right-left)/2;
				breaker=false;
			}
			if (target > nums[left+(right-left)/2]) {
				left = (left+(right-left)/2) + 1;
			} else {
				right = (left+(right-left)/2) - 1;
			}
			if(left>right) {
				breaker=false;
			}
		}
		System.out.println("OutPut is " + output);
		
		
		
	}
}
