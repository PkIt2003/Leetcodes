import java.util.stream.*;
import java.util.*;
public class Unique_Char_inStrin {
    public int firstUniqChar(String s) {
        // id-387. First Unique Character in a String
       StringBuilder str = new StringBuilder(s);
       int index =-1;
       int flag =0;
       for(int i=0;i<s.length();i++){
            if(str.charAt(i)=='@'){
                continue;
            }
            for(int j=i+1;j<=s.length()-1;j++){
                if(str.charAt(i)==str.charAt(j)){
                    str.setCharAt(j,'@');
                    flag = 1;
                }
            }
            if(flag==1){
                str.setCharAt(i,'@');
                flag =0;
            }
            else{
                index = i;
                break;
            }
       }

       char tar = '@';
       boolean istar = str.chars().allMatch(c -> c == tar);
       if(istar==true){
        return -1;
       }
       return index;
    }

}
