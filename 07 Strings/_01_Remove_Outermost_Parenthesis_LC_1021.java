package _07_Strings;

public class _01_Remove_Outermost_Parenthesis_LC_1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder(s.length());
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '(') {
                if(count != 0)
                    str.append(c);
                count++;
            }
            else if(c == ')'){
                count--;
                if(count != 0)
                    str.append(c);
            }
        }
        return str.toString();
    }
}
