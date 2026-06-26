package _05_ArrayProblems;
import java.util.List;
import java.util.ArrayList;

public class _27_Pascals_Triangle_LC_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        for(int i=1;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            List<Integer> prevRow = result.get(i-1);
            temp.add(1);
            for(int j=1;j<i;j++){
                temp.add(prevRow.get(j-1)+prevRow.get(j));
            }
            temp.add(1);
            result.add(temp);
        }

        return result;
    }
}
