class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1) ){
            return "";
        }
// != compare memory location and returns answer in true or false where else !.equal 
// Comparing object values, such as the text inside String instances.
        int gcdLength = calculateGCD(str1.length(),str2.length());
        return str1.substring(0,gcdLength);

        
    }

    private int calculateGCD(int a, int b){
        return b==0 ? a : calculateGCD(b,a%b);

    }
}