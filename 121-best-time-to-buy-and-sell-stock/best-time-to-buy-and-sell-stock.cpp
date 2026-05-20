class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int m =0;
        int best = prices[0];
        for(int  i = 1; i<prices.size(); i++){
            if(prices[i]>best){
                m = max(m,prices[i]-best);
            }
            best = min(best,prices[i]);
        
        
        }
        return m;
    }
};