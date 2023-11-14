class Solution {
    public boolean[] prime;
    
    public int solution(int[] nums) {
        prime = new boolean[3001];
        setPrime();
        int answer = 0;
        
        for(int i=0; i<nums.length - 2; i++){
            for(int j=i+1; j<nums.length - 1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(!prime[nums[i]+nums[j]+nums[k]]) answer++;
                }
            }
        }
        return answer;
    }
    
    public void setPrime(){
        for(int i=2; i*i <= 3000; i++){
            for(int j=i; i*j <= 3000; j++){
                prime[i*j] = true;
            }
        }
    }
   
}