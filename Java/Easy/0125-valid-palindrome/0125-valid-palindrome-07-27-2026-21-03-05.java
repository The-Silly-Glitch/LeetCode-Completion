import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        List<Character> str = new ArrayList<>();
        List<Character> str2 = new ArrayList<>();
        char[] str1 = s.toCharArray();
        
        for(char c : str1){
            if(Character.isLetterOrDigit(c)) {
                str.add(Character.toLowerCase(c));
                str2.add(Character.toLowerCase(c));
            }
        }
        
        Collections.reverse(str2);
        if(str.equals(str2))return true;

        return false;

    }
}