class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int a : arr)
        {
            map.put(a , map.getOrDefault(a , 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>(map.values());

        return set.size() == map.size();
    }
}