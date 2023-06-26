class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
    int n= nums.length;
    int target = 0;

     for(int i = 0 ; i < n ; i++)
     { 
         target += nums[i];
     }
       
       // if sum of the array cannot be divided into k buckets then return false.
      if(target%k != 0) return false;
      else  target = target/k ;

//Array to keep track of what elements we have used
      boolean[] arr = new boolean[n];
      Arrays.fill(arr , false);  
 
        return solve(arr , nums , 0 , 0 , target , k);
    }

 //k = number of subsets to be made
 //target is the desired sum of each subset (sum for each bucket)
    public boolean solve(boolean[] arr , int[] nums , int subsetSum , int i , int target ,int k)
    { 
        //base condition 1: No more subsets to be made
       if(k == 0) 
       return true;
      
      // base condition 2: 1 subset made then do k-1 and set subSet sum back to zero.
       if(subsetSum == target)
       {
          return solve(arr ,nums , 0 , 0 , target , k -1);
       }

      for(int j = i ; j < nums.length ; j++)
      { 
          if(arr[j] == true || (subsetSum + nums[j]) > target)
          continue;

          arr[j] = true; //mark the value we have used
          //recursive call
          if (solve(arr ,nums , subsetSum + nums[j] , j+1 ,target, k))
          return true;


          //backtracking
          //unmarking the value we have just used
          arr[j] = false;

      }

        // our loop through every possible decision and doesn't find decision so return false
      return false;
    }
}


// NeetCode -- https://www.youtube.com/watch?v=mBk4I0X46oI