//id-412.// 

//Fizz Buzz//

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list =new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }
            else if(i%5==0){
                list.add("Buzz");
            }
            else if(i%3==0){
                list.add("Fizz");
            }
            else{
                String str =Integer.toString(i);
                list.add(str);
            }
        }
        return list;
        }
    }