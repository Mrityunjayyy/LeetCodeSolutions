class Solution {
    public int findKthLargest(int[] nums, int k) {
      int n = nums.length;
      int m = quickSelect(nums , 0 , n-1 , n - k +1 );  
      // agar kth smallest element hai 
      // to n - k + 1  (kth) largest element hoga
      return nums[m];
    }


    public int quickSelect(int[] nums , int low , int high , int k)
    {
        
        int m = partition(nums , low , high);

        if(m == k-1)
        return m;

        else if(m < k-1)  //right search
        {
           return quickSelect(nums , m +1 , high , k);
        }

        else        //left search
        {
           return quickSelect(nums , low , m-1 , k);
        }
    }


    public int partition(int[] arr , int low , int high)
    {
        //randomized quick sort
        int random = low + (int)Math.random() % (high - low + 1);
        int tem = arr[random];
        arr[random] = arr[low];
        arr[low] = tem;


        int i = low ;
        int pivot = arr[low];

        for(int j = low +1 ; j <= high ; j++)
        { 
            if(arr[j] <= pivot)  //descending order
            {
                i = i + 1;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }


        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;

 
        return i;
    }
} 