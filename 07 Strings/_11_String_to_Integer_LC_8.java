package _07_Strings;

public class _11_String_to_Integer_LC_8 {
    public int myAtoi(String s) {
        if(s.isEmpty())
            return 0;

        int n = s.length();
        int i=0;
        //Ignoring Starting spaces
        while(i<n && s.charAt(i)==' ')
            i++;

        //If pointer reaches end --> string was just whitespaces
        if(i==n)
            return 0;

        //check for sign(if not exists then positive)
        int sign = 1;
        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i)=='-') ? -1 : 1;
            i++;
        }

        while(i<n && s.charAt(i) == '0')
            i++;

        int result = 0;
        //Iterate
        while(i<n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            int digit = s.charAt(i) - '0';
            if((result > Integer.MAX_VALUE/10) || (result == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10)){
                return (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result*10 + digit;
            i++;
        }

        return result * sign;

    }
}
