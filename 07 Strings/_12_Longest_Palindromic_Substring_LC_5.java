package _07_Strings;

public class _12_Longest_Palindromic_Substring_LC_5 {
    private int start = 0;
    private int maxLength = 0;
    public String longestPalindrome(String s) {
        int n = s.length();

        for(int i=0;i<n;i++){
            expand(s,i,i,n);//odd
            expand(s,i,i+1,n);//even
        }
        return s.substring(start,start+maxLength);
    }
    private void expand(String s,int l,int r,int n){
        while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        if(r-l-1 > maxLength){
            maxLength = r-l-1;
            start = l+1;
        }
    }
}
