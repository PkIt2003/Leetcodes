public class RansomNote {
        public boolean canConstruct(String ransomNote, String magazine) {
            // id-383. Ransom Note
            boolean boo = true;
            StringBuilder rans = new StringBuilder(ransomNote);
            StringBuilder mag = new StringBuilder(magazine);
            for (int i = 0; i < ransomNote.length(); i++) {
                boolean found = false;
                for (int j = 0; j < magazine.length(); j++) {
                    if (rans.charAt(i) == mag.charAt(j)) {
                        rans.setCharAt(i, '@');
                        mag.setCharAt(j, '@'); 
                        found = true;
                        break; 
                    }
                }
                if (!found) {
                    boo = false;
                    break;
                }
            }
            return boo;
        }
}
