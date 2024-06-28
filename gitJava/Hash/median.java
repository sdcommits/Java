package Hash;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[100];
        int i;
        int s = nums1.length+nums2.length;
        for(i=0;i<nums1.length;i++){
            nums3[i] = nums1[i];
        }
        for(int j =0;j<nums2.length;j++){
            nums3[i] = nums2[j];
            i++;
        }
        double out = 0;
        for(i=0;i<s;i++){
            if(s%2 != 0){
                if(i == s/2){
                    out = nums3[i+1];      
                }
            }
            else{
                if(s%2 == 0){
                     if(i == s/2){
                        out = (nums3[i]+nums3[i+1])/2;
                    }
                }
            }
        }

        return out;

        
    }
}

public class median {
    
}
