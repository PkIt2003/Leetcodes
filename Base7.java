public class Base7 {
    // id -504
    public String convertToBase7(int num) {
        boolean boo = true;
        String str = "";
        if(num<0){
            boo = false;
            num = Math.abs(num);
            while(num!=0){
                str = Integer.toString(num%7) + str;
                num = num/7;
            }
            str = "-"+str;
        }
        else if(num==0){
            str = "0";
        }
        else{
            while(num!=0){
                str = Integer.toString(num%7)+str;
                num = num/7;
            }
        }
        return str;
        
    }
}
