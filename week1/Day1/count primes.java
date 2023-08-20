class Solution {
    public int countPrimes(int n) {
       int count=0;
       if(n<2) 
          return 0;
        boolean[] primes = new boolean[n+1];
        for(int i=0;i<n;i++){
            primes[i]=true;
        }
        for (int i=2;i<n;i++) {
            if(primes[i]){
                count++;
                if((long)i*i<n){
                     for(int j=i*i;j<n;j+=i)
                     primes[j]=false;
                }

            }
          }
    return count;
    
    }      

}
