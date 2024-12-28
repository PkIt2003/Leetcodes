import java.util.*;
public class Word_Pattern {
    // id-290. Word Pattern
    public boolean wordPattern(String pattern, String s) {
        String str[] = s.split(" ");
        int len = str.length;
        if (pattern.length() != len) { 
            return false;
        }
        
        int[] num1 = new int[len];
        int k = 1;
    
        for (int i = 0; i < len; i++) {
            if (num1[i] == 0) {
                num1[i] = k;
                for (int j = i + 1; j < len; j++) {
                    if (str[i].equals(str[j])) {
                        num1[j] = k;
                    }
                }
                k++;
            }
        }

        int len1 = pattern.length();
        int[] num2 = new int[len1];
        int l = 1;
        for (int i = 0; i < len1; i++) {
            if (num2[i] == 0) {
                num2[i] = l;
                for (int j = i + 1; j < len1; j++) {
                    if (pattern.charAt(i) == pattern.charAt(j)) {
                        num2[j] = l;
                    }
                }
                l++;
            }
        }
        return Arrays.equals(num1, num2);
    }

}
