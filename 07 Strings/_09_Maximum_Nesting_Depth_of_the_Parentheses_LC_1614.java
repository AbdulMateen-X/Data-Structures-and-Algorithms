package _07_Strings;

public class _09_Maximum_Nesting_Depth_of_the_Parentheses_LC_1614 {
    public int maxDepth(String s) {
        int count = 0,max = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                count++;
                max = Math.max(max,count);
            }
            else if(ch == ')')
                count--;
        }
        return max;
    }
}
