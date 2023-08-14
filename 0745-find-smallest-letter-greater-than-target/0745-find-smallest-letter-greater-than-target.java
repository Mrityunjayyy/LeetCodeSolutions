class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = binarySearch(letters , letters.length , target);
        return ans == '$' ? letters[0] : ans ;
    }

    public char binarySearch(char[] arr , int n , char target)
    {
        int low = 0 ; 
        int high = n-1;
        char c = '$';

        while(low <= high )
        {
            int mid = low  + (high - low)/2;

            if(arr[mid] == target)
            {
                low = mid + 1;
            }

            else if(arr[mid] > target)
            {
                c = arr[mid];
                high = mid -1;
            }

            else 
            {
                low = mid +1 ;
            }
        }

        return c;
    }
}