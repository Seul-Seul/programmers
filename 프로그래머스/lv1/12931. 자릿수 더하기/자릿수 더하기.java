import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String str = new StringBuilder().append(n).toString();
        String[] arr = str.split("");
        for(int i = 0 ; i < arr.length ; i++){
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
}