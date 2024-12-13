public class ValidPalindrome {
        public boolean isPalindrome(String s) {
            // id-125. Valid Palindrome
            String remove = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            boolean boo = true;
            int i=0;
            int j=remove.length()-1;
            while(i<j){
                if(remove.charAt(i)!=remove.charAt(j)){
                    boo = false;
                    break;
                }
                else{
                    i++;
                    j--;
                }
            } 
            return boo;
        }
}
