class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        boolean doubl =true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    remove(nums[i],nums[j]);
                }
            }
            return nums[i];
        }

    }
}

public class singleNumberLeet {
    
}








// class Solution {
//     public int singleNumber(int[] nums) {
//          int n=nums.length;
//          int ans=nums[0];
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]==nums[j]){
//                     break;
//                 }
//             }
//             ans= nums[i];
//             break;
            
            
//         }

//         return ans;
//     }
// }
