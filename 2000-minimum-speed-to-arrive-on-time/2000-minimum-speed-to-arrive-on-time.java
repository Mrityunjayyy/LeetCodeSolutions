class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if(hour<dist.length-1) return -1;
        int l = 1;
        int r = 10_000_000; //question contraints 10^7
        int m;
        int ans = -1;
        while(l<=r){
            m = l + (r-l)/2;            
            if(check(dist, hour, m)){
                ans = m;
                r = m-1; //leftward search
                //agar itne time mai ho jayega to isse kam time 
            }else{
                l = m+1;
                //bada time;
            }
        }
        return ans;
    }

    public boolean check(int [] dist, double hour, double speed){
       
        double time = 0;
        int i = 0;
        while(time<=hour && i<dist.length-1){
            time += Math.ceil(dist[i]/speed);
            i++;
        }

        //for last value we just add the decimal part
        time +=dist[dist.length-1]/speed;
        return (time<=hour);
    }
}