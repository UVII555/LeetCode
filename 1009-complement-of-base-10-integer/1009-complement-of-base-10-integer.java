class Solution {
    public int bitwiseComplement(int n) {
        int mask =1;
        while(mask<n){
            mask=(mask<<1)|1;



// ~ ye bhi use krt skte thae lekin ye 32 bit ko convert krta hai like 5 is 101 but in 32 bit it will be 0000000000000---101 fir isko ~ convert krne pr 111111111-----010 ata 

// so left shift operator use kr k and 1 kiya gya hai like mask =1 se starat hua hai 1<<1
// == 10<<1 == 110 <<1 == 111 hoga fir ^ XOR use kr k flip ke dete hai 101 ( 5 ko) fir ayega 111 ^ 101 = 010 output =5
        }
        return n^mask;


        
    }
}