import java.util.ArrayList;
import java.util.List;

public class SelfDiviNumber {
    public List<Integer> selfDividingNumbers(int left, int right) {
        // id-728. Self Dividing Numbers
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i>=1 && i<=9){
                list.add(i);
            }
            else{
                String st = Integer.toString(i);
                if(st.contains("0")){
                   continue; 
                }
                else{
                    boolean boo = true;
                    for(int j=0;j<=st.length()-1;j++){
                        int temp = Character.getNumericValue(st.charAt(j));
                        if(i%temp!=0){
                            boo = false;
                            break;
                        }
                    }
                    if(boo==true){
                        list.add(i);
                    }
                }
            }
        }
        return list;
    }
}
