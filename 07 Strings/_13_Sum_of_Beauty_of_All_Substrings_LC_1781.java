package _07_Strings;

public class _13_Sum_of_Beauty_of_All_Substrings_LC_1781 {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for(int i=0;i<n-2;i++){
            int[] freq = new int[26];
            freq[s.charAt(i) - 'a']++;
            freq[s.charAt(i+1) - 'a']++;

            for(int j=i+2;j<n;j++){
                int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
                freq[s.charAt(j) - 'a']++;
                for(int k=0;k<26;k++){
                    if(freq[k] != 0){
                        if(freq[k] < min)
                            min = freq[k];
                        if(freq[k] > max)
                            max = freq[k];
                    }
                }
                sum += max - min;
            }
        }
        return sum;
    }
}
