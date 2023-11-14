class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String snum = x+"";
        // char[] arry = snum.toCharArray();
        int num = 0;

        for(int i=0; i<snum.length(); i++){
            num += Character.getNumericValue(snum.charAt(i));
            System.out.println(snum.charAt(i));
        }
   
        if(x%num!=0){
            answer = false;
        }
        
        
        return answer;
    }
}