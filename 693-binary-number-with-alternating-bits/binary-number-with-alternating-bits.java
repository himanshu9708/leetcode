class Solution {
    public boolean hasAlternatingBits(int n) {

    //     int res = n & n>>1;
    //    int  ans = res & (res+1);
    //    if(ans == res) return true;
    //     if(ans == 1) return true;
    //     return false;

        int currbit = n%2;
        n/=2;

        while(n>0){
            if(currbit == n%2 ) return false;
            currbit = n%2;
            n/=2;
        }
        return true;
        
    }
}