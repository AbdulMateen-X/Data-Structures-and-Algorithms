package _09_Recursion;
import java.util.*;

public class _10_Combination_Sum_LC_39 {
    public void solve(int[] candidates, int idx,List<Integer> current,int currentSum,int target,List<List<Integer>> result){
        if(currentSum == target){
            result.add(new ArrayList<>(current));
            return;
        }

        if(idx == candidates.length){
            return;
        }

        if(currentSum + candidates[idx] <= target){
            currentSum += candidates[idx];
            current.add(candidates[idx]);
            solve(candidates,idx,current,currentSum,target,result);

            currentSum -= current.get(current.size() - 1);
            current.remove(current.size() - 1);
            solve(candidates,idx + 1,current,currentSum,target,result);
        }
        else
            solve(candidates,idx + 1,current,currentSum,target,result);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        solve(candidates,0,current,0,target,result);
        return result;
    }

}
