
//id-2769//

Find the Maximum Achievable Number

class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int x=t;
        while(t>0){
            num = num+1;
            t=t-1;
            if(t==0){
                num =num+x;
            }
        }
        return num;
    } 

}

