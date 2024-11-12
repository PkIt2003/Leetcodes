import java.util.Arrays;
public class FindtheDifference {
    // id -389. Find the Difference
    public char findTheDifference(String s, String t) {
       char[] sarry = s.toCharArray();
       char[] tarry = t.toCharArray();
       Arrays.sort(sarry);
       Arrays.sort(tarry);
       int j=0;
       for(int i=0;i<tarry.length-1;i++){
            if(tarry[i]==sarry[j]){
                j++;
                continue;
            }
            else{
                break;
            }
       }
       return tarry[j];
    }
}
