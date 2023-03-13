class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long max , min;
        
        if(a == b)  return a;
        else if( a < b){
            max = b;
            min = a;
        }
        else{
            max = a;
            min = b;
        }
        
        while(min <= max){
            answer += min;
            min++;
        }
        return answer;
    }
}