//Question2-Find the maximum consecutive 1's in an array of 0's and 1's.

public class Question2 {
 

 private static int findMaximumOnes(int[] arr) 
	{
 
        int count = 0;
        int maxCount = 0;
 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count += 1;
            } else {
                count = 0;
            }
            maxCount = count > maxCount ? count : maxCount;
        }
        return maxCount;
    }
  public static void main(String[] args) 
	{
        //int[] arr = new int[] {1, 1, 0, 1, 0, 1, 1, 1};
        int[] arr = new int[] {1, 0, 1, 0};
 
        System.out.println(findMaximumOnes(arr));
    }
	
	
	
	
	}