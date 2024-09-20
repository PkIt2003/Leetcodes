// id -28
import java.util.*;
public class Firstindexof {
    public static int strStr(String haystack, String needle) {
        int index =0;
        if(!haystack.contains(needle)){
            return -1;
        }
        else{
            index = haystack.indexOf(needle);
            return index;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.next();
        int result = strStr(haystack,needle); 
        System.out.println(result);           
    }
}
