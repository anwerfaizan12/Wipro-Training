package day_02;

public class MultiDimensionalArray {
 public static void main(String[] args) {
	 int [][] arr = {{1,2,3,4,5},{6,7,8,9,10}};
	 System.out.println("Elememnts of the array - ");
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr[0].length;j++) {
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
	 
	 System.out.println("Length of the array - "+arr.length);
 }
}
