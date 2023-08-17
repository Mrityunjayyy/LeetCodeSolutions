class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i < arr.length ; i++)
        {
            int diff = arr[i] - arr[i-1];
            if(diff < min)
            {
                min = diff;
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] - arr[i-1] == min)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }

        return ans;
    }
}