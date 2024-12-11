import java.util.Arrays;

public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        // id -744. Find Smallest Letter Greater Than Target.
        Arrays.sort(letters);
        int pos =0;
        if(target=='z'){
            return letters[0];
        }
        else{
            for(int i=0;i<letters.length;i++){
                if(target<letters[i]){
                    pos = i;
                    break;
                }
                else if(target==letters[i]){
                    continue;
                }
            }
        
        }
       return letters[pos];   
    }  
        
}

