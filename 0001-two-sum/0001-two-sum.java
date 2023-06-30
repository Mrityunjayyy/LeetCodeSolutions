class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)
        {//values of the array is key and the index is the value
        map.put(nums[i] , i);
        }
         
        int[] result = new int[2];
        Arrays.fill(result , -1);
        

        for(int i = 0 ; i < n ;i++)
        { 
            if(nums[i] == target && map.containsKey(0))
            {
                result[0] = i;
                result[1] = map.get(0);
                break;
            }

            else if(map.containsKey(target - nums[i]))
            {  
                //element is non repetable
                if(map.get(target - nums[i]) > i)
                {
                    result[0] = i;
                    result[1] = map.get(target - nums[i]);
                    break;
                }
            }   
        }


        return result;
    }
}