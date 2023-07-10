class Solution {
    public int[] sortArray(int[] nums) {
      int n  = nums.length; 
      merge(nums , 0 , n-1);

      return nums;

    }


    public void merge(int[] arr , int l , int r)
    { 
        if(l < r)
        { 
            int mid = l + (r-l)/2;

            merge(arr , l , mid);

            merge(arr , mid +1 , r);

            sort(arr , l , mid , r);
        }
    }


    public void sort(int[] arr , int l , int mid , int r)
    {
        int i,j,k;
        
        int n1 = mid - l +1 ; 
        int n2 = r - (mid+1) +1 ;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for( i = 0 ; i< n1 ; i++)
        { 
            left[i] = arr[l+i];
        }

        for( j = 0 ; j < n2 ; j++)
        { 
            right[j] = arr[mid +1 + j];
        }

        i = 0; 
        j = 0 ; 
        k = l;

        while(i < n1 && j < n2)
        { 
            if(left[i] < right[j])
            { 
                arr[k] = left[i];
                i = i +1;
            }
            else 
            { 
                arr[k] = right[j];
                j = j +1;
            }

            k = k + 1;
        }

        while(i < n1)
        { 
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < n2)
        { 
            arr[k] = right[j];
            k++;
            j++;
        }
    }
}