public class _04_Valid_Palindrome_LC125 {
    public static boolean isPalindrome(String s) {
        //Removing all non-alphanumeric characters including spaces
        String cleanString = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int p1 = 0, p2 = cleanString.length() - 1;
        while(p1 < p2){
            if(cleanString.charAt(p1) != cleanString.charAt(p2))
                return false;
            p1++;
            p2--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }
}
