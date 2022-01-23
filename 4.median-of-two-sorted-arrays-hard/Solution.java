//https://leetcode.com/problems/median-of-two-sorted-arrays/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int l3=nums1.length+nums2.length;
        int arr[]=new int[l3];
        int c1=0,c2=0,c3=0;
        while(c1<l1 && c2<l2)
        {
            if(nums1[c1]<nums2[c2])
            {
                arr[c3++]=nums1[c1++];
            }
            else
            {
                arr[c3++]=nums2[c2++];
            }
            
        }
        while(c1<l1)
            arr[c3++]=nums1[c1++];
        while(c2<l2)
            arr[c3++]=nums2[c2++];

        if(l3%2==1)
            return (double)arr[(l3/2)];
        else
            return (double)((arr[l3/2]+arr[(l3/2)-1])/2.000000);
    }
}
