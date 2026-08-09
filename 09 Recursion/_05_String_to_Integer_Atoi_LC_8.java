package _09_Recursion;

public class _05_String_to_Integer_Atoi_LC_8 {

    public int solve(String s,int i,int sign,int result,boolean flag){
        if(i == s.length())
            return result * sign;
        char ch = s.charAt(i);
        if(ch == ' ' && flag)
            return solve(s,i+1,sign,result,flag);
        else if((ch == '-' || ch == '+') && flag) {
            flag = false;
            sign = (ch == '-')?-1:1;
            return solve(s, i + 1, sign, result, flag);
        }
        else if(ch >= '0' && ch <= '9'){
            flag = false;
            int digit = ch - '0';
            if((result > Integer.MAX_VALUE/10) || (result == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10))
                return (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            result = result * 10 + digit;
            return solve(s,i+1,sign,result,flag);
        }
        else
            return result * sign;
    }
    public int myAtoi(String s) {
        return solve(s,0,1,0,true);
    }
}
