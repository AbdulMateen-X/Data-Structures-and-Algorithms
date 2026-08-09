package _09_Recursion;
import java.util.List;
import java.util.ArrayList;
public class _07_Generate_Parenthesis_LC_22 {
    public static void solve(String currentString,int openUsed,int closeUsed,int n,List<String> result){
        if(currentString.length() == 2*n){
            result.add(currentString);
            return;
        }
        if(openUsed < n){
            solve(currentString + '(', openUsed+1,closeUsed,n, result);
        }
        if(closeUsed < openUsed){
            solve(currentString + ')',openUsed,closeUsed+1,n,result);
        }
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve("",0,0,n,result);
        return result;
    }

    public static void main(String[] args){
        int n = 11;
        List<String> result = generateParenthesis(n);
        for(String str : result){
            System.out.print(str + " , ");
        }
    }
}
