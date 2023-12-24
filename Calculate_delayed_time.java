//id-2651.//

 //Calculate Delayed Arrival Time//



class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum =arrivalTime+delayedTime;
        int tot=0;
        if(sum==24){
            tot =0;
        }
        else if(sum>24){
            tot =(arrivalTime+delayedTime)-24;
        }
        else if(sum<24){
            tot =sum;
        }
        return tot;
    }
}