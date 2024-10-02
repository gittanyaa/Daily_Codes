package Leetcode;

class Solution {
    
  
    public long MOD = 1_000_000_007;
    
    public int countGoodNumbers(long n) {
        
        // Calculate the number of even and odd positions 
        long odd = n/2;
        long even = (n+1)/2;
  
        return (int)(pow(5,even) * pow(4,odd) % MOD);
    }
    
    public long pow(long x, long n){
        
        // Base case
        if(n==0) 
            return 1;
        
        //  recursion calculate x^(n/2)
        long temp = pow(x,n/2);
        
        // If n is even,  (x^(n/2))^2
        if(n%2==0){
            return (temp * temp)% MOD;
        }
        // If n is odd, (x^(n/2))^2 * x
        else{
            return (x * temp * temp)% MOD;
        }
    }
}
