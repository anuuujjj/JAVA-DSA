import java.util.Arrays;

public class RemoveValLeetcode {

    public static int returnk(int k){
        // System.out.println(k);
        
    return k;
    }
    public static void main(String[] args){
        int nums[]={0,1,2,5,2,6,7};
        int val=2;
        int k=0;

        int n=nums.length;
        
        for(int i=0;i<n;i++){
            
         if(nums[i]!=val){ 
            nums[k]=nums[i];
            k++;
         }
        
        }
        returnk(k);
        // System.out.println(Arrays.toString(nums));
        // System.out.println((k));


}
}





// //class Solution {
    
//     public int removeElement(int[] nums, int val) {
//         int k=0;

//         int n=nums.length;
        
//         for(int i=0;i<n;i++){
            
//          if(nums[i]!=val){ 
//             nums[k]=nums[i];
//             k++;
//          }
        
//         }
//         return k;
// }}