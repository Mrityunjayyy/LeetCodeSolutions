class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
         if(nums[0] <= nums[n-1]) return nums[0]; 

        int index = indexOfSmallestElement(nums , n);
        return nums[index];
    }
     public int indexOfSmallestElement(int[] arr, int n)
    {
       int low  = 0; 
       int high = n-1;
       while(low <= high)
       {
           int mid = low + (high - low)/2;
           int prev = (mid + n -1)%n;
           int next = (mid + 1) %n;
           
           if(arr[mid] <= arr[next] && arr[mid] <= arr[prev])
           {
              return mid;
           }
           
           else if(arr[mid] <=  arr[high]) //right array is shoifted move left
           high = mid -1;
           
           else if(arr[low] <= arr[mid]) //left array is sorted move right
           low = mid +1;
           
       }
       
       return -1;
    }
}