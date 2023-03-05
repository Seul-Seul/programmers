import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int max = Integer.parseInt(strArr[0]);
        int min = Integer.parseInt(strArr[0]);
        //int[] intArr = new int[strArr.length];
        for(int i = 1 ; i < strArr.length ; i++){
           //intArr[i] = Integer.parseInt(strArr[i]);
            if(Integer.parseInt(strArr[i]) > max){
                max = Integer.parseInt(strArr[i]);
            }
            if(Integer.parseInt(strArr[i]) < min){
                min = Integer.parseInt(strArr[i]);
            }
        }
        
        String answer = new StringBuilder().append(min).append(" ").append(max).toString();
        return answer;
    }
}