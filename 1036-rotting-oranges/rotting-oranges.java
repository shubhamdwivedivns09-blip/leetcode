class Solution {
    public int orangesRotting(int[][] arr) {
        int row=arr.length;
        int cols = arr[0].length;
        int fresh=0;
        Queue<int[] > q = new ArrayDeque<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==1){
                    fresh++;
                }else if(arr[i][j]==2){
                q.offer(new int[]{i,j});
                arr[i][j]=0;
            }
            }
        }
        if(fresh==0){
            return 0;
        }
        int min=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int k=0;k<size;k++){
                int[] curr = q.poll();
                int cr=curr[0];
                int cc=curr[1];
                int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
                for(int i=0;i<dir.length;i++){
                    int nr =cr+dir[i][0];
                    int nc = cc+dir[i][1];
                    if(nr>=0 && nr <row && nc>=0 && nc<cols && arr[nr][nc]==1){
                        arr[nr][nc]=0;
                        fresh--;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
            min++;
            if(fresh==0) return min;
        }
        return (fresh==0?min:-1);
    }
}