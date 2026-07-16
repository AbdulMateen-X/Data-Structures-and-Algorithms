package _07_Strings;

public class _02_Reverse_Words_In_a_String_LC_151 {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder str = new StringBuilder(s.length());
        int leftIdx = s.length()-1,rightIdx = s.length()-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' ')
                leftIdx = i;
            else{
                str.append(s, leftIdx, rightIdx + 1).append(" ");
                while(s.charAt(i-1) == ' ')
                    i--;
                rightIdx = i-1;
            }
        }
        str.append(s, leftIdx, rightIdx + 1);

        return str.toString();
    }
}
