package _07_Strings;

public class _07_Valid_Anagram_LC_242 {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        if(n != t.length())
            return false;

        //Default 0's
        int[] map = new int[26];
        for(int i=0;i<n;i++){
            map[s.charAt(i) - 'a']++; //'a' means 97
            map[t.charAt(i) - 'a']--;
        }

        for(int i=0;i<26;i++){
            if(map[i] != 0)
                return false;
        }

        return true;
    }
}
