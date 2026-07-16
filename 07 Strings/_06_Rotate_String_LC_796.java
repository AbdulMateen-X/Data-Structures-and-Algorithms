package _07_Strings;

public class _06_Rotate_String_LC_796 {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        String str = s + s;
        return str.contains(goal);
    }
}
