class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        //for문 돌림
        for(int i = 0 ; i < seoul.length ; i++){
            if(seoul[i].equals("Kim")){
                answer = new StringBuilder().append("김서방은 ").append(i).append("에 있다").toString();
            break;
            }
        }
    
        return answer;
    }
}