public class Anagram {
    public boolean isAnagram(String s, String t) {
        // id-242
        char sarr[] = s.toCharArray();
        char tarr[] = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        String str1 = new String(sarr);
        String str2 = new String(tarr);
        if(str1.equals(str2)){
            return true;
        }
        else{
            return false;
        }

    }
}
