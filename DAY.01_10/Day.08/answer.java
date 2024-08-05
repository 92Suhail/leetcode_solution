class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t=m+n;
        int result[]=new int[t];
        int j=0;
        for(int i=0;i<m;i++){
            result[i]=nums1[i];
            j++;
        }
        for(int k=0;k<n;k++){
            result[j]=nums2[k];
            j++;
        }
        Arrays.sort(result);
        
        for(int l=0;l<t;l++){
            nums1[l]=result[l];
            
        }
        
        
    }
}