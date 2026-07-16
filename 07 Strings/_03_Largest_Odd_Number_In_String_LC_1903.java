package _07_Strings;

public class _03_Largest_Odd_Number_In_String_LC_1903 {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i=n-1;i>=0;i--){
            if(num.charAt(i) %2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
