class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int totalMoney = 0;
        int maxWealth = -1;
        for(int i = 0; i<m;i++){
            for(int j = 0;j<n;j++){
                totalMoney += accounts[i][j];
            }
            if(maxWealth < totalMoney){
                maxWealth  = totalMoney;}
        }
        return maxWealth;
        
    }
}