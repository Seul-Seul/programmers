class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] splitS = s.split("");
        int pCnt = 0;
        int yCnt = 0;
        
        for(int i = 0 ; i < splitS.length ; i++){
            if(splitS[i].equals("p") || splitS[i].equals("P")) pCnt++;
            else if(splitS[i].equals("y") || splitS[i].equals("Y")) yCnt++;
        }
        
        if(pCnt != yCnt)    answer = false;

        return answer;
    }
}