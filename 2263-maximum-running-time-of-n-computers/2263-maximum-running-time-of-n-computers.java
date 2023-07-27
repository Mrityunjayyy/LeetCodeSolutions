class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum  = 0l;
        for(int i : batteries)
        {
            sum += i;
        }

        long low = 1;
        long high = sum/n;

        while(low < high)
        {
            long mid = (low + high  +1)/2;
            if(check(batteries , mid , n))
            {
                low = mid ;
            }
            else 
            {
                high = mid -1;
            }
        }

        return low;
    }

    boolean check(int[] b , long time , int n)
    {
        long sum = 0;
        for(int i : b)
        {
            sum += Math.min(time , i);
        }

        return (sum >= n * time);
    }
}