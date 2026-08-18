class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second= Integer.MAX_VALUE;
        //int third = nums[2];

      
        for (int i=0;i<nums.length;i++){

              if (nums[i] <= first){
            first = nums[i];
        } else if
             (nums[i] < second && nums[i]> first ){ 
                second=nums[i];
            
           // return true;
        }
            else if(first<second && second<nums[i]){
                return true;
            }
        }
       
        return false;
              
    
    }
            
}