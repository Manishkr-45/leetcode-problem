class Solution {
public:
    int maxArea(vector<int>& height) {
        int lp=0;
        int rp = height.size()-1;
        int ans=0;
        int currwater=0;
        while(lp<rp){
            int w=rp-lp;
            int h=min(height[lp],height[rp]);
            currwater=w*h;
            ans=max(ans,currwater);
            height[lp]<height[rp] ? lp++ : rp--;

        }
        return ans;

        
    }
};