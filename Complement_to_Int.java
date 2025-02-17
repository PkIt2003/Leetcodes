import java.util.*;
public class Complement_to_Int {
    //1009. Complement of Base 10 Integer
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        String binaryString = Integer.toBinaryString(n);
        StringBuilder st = new StringBuilder(binaryString);
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '1') {
                st.setCharAt(i, '0'); 
            } else {
                st.setCharAt(i, '1'); 
            }
        }
        int num = Integer.parseInt(st.toString(), 2);
        return num;
    }
}
