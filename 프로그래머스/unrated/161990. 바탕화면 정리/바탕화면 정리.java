class Solution {
    public int[] solution(String[] wallpaper) {
        String res = "";
        int rows = wallpaper.length;
        int cols = wallpaper[0].length();
        
        int rowMn = rows;
        int colMn = cols;
        int rowMx = 0;
        int colMx = 0;
        int trigg = 0;
        
        char[][] wlpr = new char[rows][cols];
        
        while(true){
          
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    char c = wallpaper[i].charAt(j);
                    
                    if(c=='#'){
                        if(trigg==0){
                            if(i<rowMn) rowMn = i;
                            if(j<colMn) colMn = j;
                        } else {
                            if(i>rowMx) rowMx = i;
                            if(j>colMx) colMx = j;
                        }
                    }
                }
            }
            trigg++;
            
            if(trigg>1) break;
        }
        int [] answer = {rowMn,colMn,rowMx+1,colMx+1};

       
        return answer;
    }
}