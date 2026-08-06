// class Solution {
//     public int smallestNumber(int n, int t) {

          
//         //     }
        
//         // int i =n;
//         while(true){

//         if (getDigitProduct(n) % t == 10){
//                 return n;
           
//         }
//         n++;
//     }
// }

// private int getDigitProduct(int num){
//      //int num=i;
//             int product=1;
//             while(num>0){
//                 int rem = num%10;
//                 product = product*rem;
//                 num = num/10;
//             }
//           return product;
// }
// }


class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (getDigitProduct(n) % t == 0) {
                return n;
            }
            n++;
        }
    }

    private int getDigitProduct(int num) {
        int product = 1;
        while (num > 0) {
            product *= (num % 10);
            num /= 10;
        }
        return product;
    }
}