class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> al = new ArrayList<>();

        solve(nums , ans  , al , 0);
        HashSet set = new HashSet<>(ans);
        ans.clear();
        ans.addAll(set);
        return ans;

    }

    public void solve(int[] a , List<List<Integer>> ans , List<Integer> al, int index)
    {
        if(index == a.length)
        { 
              List<Integer> arrayList = new ArrayList<>();
        for (int value : a) {
            arrayList.add(value);
        }
            ans.add(arrayList);
            return;
        }

        for(int i = 0 ; i < a.length  ; i++)
        {
            swap(a ,i , index);
            solve(a , ans , al , index +1 );
            swap(a ,i , index);
        }
    }

    public void swap(int[] a , int i ,int j)
    { 
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}