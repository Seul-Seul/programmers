class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        String str = new StringBuilder().append(n).reverse().toString();
        String[] splitArr = str.split("");
        answer = new int[splitArr.length];
        
        for(int i = 0 ; i < splitArr.length ; i++){
            answer[i] = Integer.parseInt(splitArr[i]);
        }
        
        return answer;
    }
}