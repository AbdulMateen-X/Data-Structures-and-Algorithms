package _07_Strings;

public class _05_Isomorphic_Strings_LC_205 {
    public boolean isIsomorphic(String s, String t) {
        // Arrays initialized to 0 by default (0 means not seen)
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        int n = s.length();

        for(int i=0;i<n;i++){
            char ch1 = s.charAt(i), ch2 = t.charAt(i);
            if(mapS[ch1] != mapT[ch2])
                return false;

            mapS[ch1] = i+1;
            mapT[ch2] = i+1;
        }

        return true;
    }
}
