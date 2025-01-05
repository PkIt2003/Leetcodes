public class Back_space_string {
        // id-844. Backspace String Compare
        public boolean backspaceCompare(String s, String t) {
            StringBuilder str = new StringBuilder(s);
            StringBuilder str2 = new StringBuilder(t);
            for(int i=s.length()-1;i>=0;i--){
                if(str.charAt(i)=='#'){
                    str.deleteCharAt(i);
                    for(int j=i-1;j>=0;j--){
                        if(str.charAt(j)!='#'){
                            str.deleteCharAt(j);
                            i = str.length();
                            break;
                        }
                    }
                }
            }
            for(int k=t.length()-1;k>=0;k--){
                if(str2.charAt(k)=='#'){
                    str2.deleteCharAt(k);
                    for(int l=k-1;l>=0;l--){
                        if(str2.charAt(l)!='#'){
                            str2.deleteCharAt(l);
                            k = str2.length();
                            break;
                        }
                    }
                }
            }
            String s1 = str.toString();
            String t1 = str2.toString();
            boolean result = s1.equals(t1);
            return result;
    
        }
    
}
