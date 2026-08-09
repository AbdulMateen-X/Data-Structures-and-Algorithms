package _09_Recursion;
import java.util.*;

public class _08_Subsets_LC_78 {

    public void solve(int[] nums,int idx,List<Integer> current,List<List<Integer>> result){
        if(idx == nums.length){
            result.add(new ArrayList<>(current));
        }
        else{
            solve(nums,idx+1,current,result);
            current.add(nums[idx]);
            solve(nums,idx+1,current,result);
            current.removeLast();
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        solve(nums,0,current,result);
        return result;
    }
}
