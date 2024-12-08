import java.math.BigInteger;
import java.util.Arrays;
public class Plus_one {
    public int[] plusOne(int[] digits) {
        
        // id-66. Plus One

        String str = Arrays.toString(digits).replaceAll("[\\[\\], ]", "");
        BigInteger large = new BigInteger(str);
        BigInteger one = new BigInteger("1");
        BigInteger result = large.add(one);
        String resultStr = result.toString();
        int[] dig = new int[resultStr.length()];
        for (int i = 0; i < resultStr.length(); i++) {
            dig[i] = resultStr.charAt(i) - '0';
        }
        return dig;
    }
}
