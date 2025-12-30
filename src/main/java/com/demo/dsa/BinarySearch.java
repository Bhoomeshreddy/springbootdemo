package com.demo.dsa;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] input = {1, 6, 9, 12, 17, 18, 26, 29, 44};
		int searchElement = 45;
		
		int foundAt = BinarySearch.binarySearch(input, searchElement);
		if(foundAt < 0) {
			System.out.println("Search Element doesn't exist in the given array");
		} else {
			System.out.println("Search Element found at : "+ foundAt);
		}
		
	}
	
    public static int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start<= end)
        {
           int mid = (start+end)/2;
           if(nums[mid] == target)
           {
              return mid;
           }
           if(nums[mid]>target)
           {
               end = mid-1;
           }
            else
            {
               start = mid+1;
            }
        }
        return -1;
    }

}
