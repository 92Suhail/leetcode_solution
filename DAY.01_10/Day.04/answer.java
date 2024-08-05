class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;//2
        int n2=nums2.length;//1
        int n3=n1+n2;//3
        int result[]= new int[n3];
        int j=0;
        for(int i=0 ; i<n1 ; i++){
            result[i]=nums1[i];
            j++;
        }
        
        for(int i=0 ; i<n2 ; i++){
            result[j]=nums2[i];
            j++;
        }
        
        Arrays.sort(result);
        if(n3%2==0){
            int k=(n3-1)/2;
            float d=(float)(result[k]+result[k+1])/(float)2;
            return d;
        }else{
            float e=result[(n3-1)/2];
            return e;
        }
    }
}