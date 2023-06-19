class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    ArrayList<Integer> al = new ArrayList();

    for(int a[] : matrix)
    { 
        for(int b : a)
        {
            al.add(b);
        }
    }

    System.out.println(al);
    

    Integer[] arr = new Integer[al.size()];
    arr = al.toArray(arr);

    // Integer[] arr = al.toArray();


    int n = arr.length;

    int low = 0, high = n-1; 
    boolean flag = false;
    while(low <= high)
    { 
        int mid = low + (high - low)/2;
        
        if(arr[mid] == target)
         { 
             flag = true;
             break;
         }

         else if(arr[mid] < target)
         { 
             low = mid + 1;
         }

         else
         { 
             high = mid -1;
         }     
    }


    return flag;
    }
}