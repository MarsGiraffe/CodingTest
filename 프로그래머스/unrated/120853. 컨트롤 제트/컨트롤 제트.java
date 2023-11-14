class Solution {
    public String[] arry;
    
    public int solution(String s) {
        int answer = 0;
        arry = s.split(" ");
        setArr();
        for(int i=0; i<arry.length; i++){
            if(!arry[i].equals("Z"))
            answer += Integer.parseInt(arry[i]);
        }
        
        return answer;
    }
    
    public void setArr(){
        for(int i=0; i<arry.length; i++){
            if(arry[i].equals("Z")){
                arry[i-1] = "0";
            }
        }
    }
}