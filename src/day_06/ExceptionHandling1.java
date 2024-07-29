package day_06;

public class ExceptionHandling1 {
 public static void main(String[] args) {
	 int[] nums = {1,2,3};
	 try {
		 System.out.println(nums[10]);
	 }catch(Exception e) {
		 {System.out.println(e+"Given number is out of index.The length of the given array is "+nums.length);}
	 }
 }
}
