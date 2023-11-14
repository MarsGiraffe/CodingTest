class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int maxV = 1;
        // int i = 0;
        if(sides[0]>sides[1]) {
            for(int i=1; i<=sides[0]; i++){
                if(i>sides[0]-sides[1]) {
                    if(i>maxV) maxV = i;
                    answer++;
                    System.out.println("긴 변"+sides[0]+": "+i);
                }
            }
        } else {
            for(int i=1; i<=sides[1]; i++){
                if(i>sides[1]-sides[0]) {
                    if(i>maxV) maxV = i;
                    answer++;
                    System.out.println("긴 변"+sides[1]+": "+i);
                }
            }
        } 
        for(int i=0; i<sides[0]+sides[1]; i++){
            if(i>maxV){
                answer++;    
                System.out.println("긴 변이 나머지: "+i+" : ans"+answer);
            }
            
            
        }
          
        
        
        return answer;
    }
}