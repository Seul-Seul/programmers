class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        String str = new StringBuilder().append(n).toString();
        String[] splitStr = str.split("");
        int num = splitStr.length;
        answer = new int[num];
        
        for(int i = 0 ; i < num ; i++){
            answer[i] = Integer.parseInt(splitStr[num-1-i]);
        }
        return answer;
    }
}