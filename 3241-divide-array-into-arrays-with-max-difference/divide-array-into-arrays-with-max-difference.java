class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);      
        int [][]arr=new int [nums.length/3][3];
        int [][]arr1={};
        if(nums.length%3!=0){
            return arr1;
        }
        int m=0;
        for(int i=2;i<nums.length;i+=3){
            int z=0;
            if(nums[i]-nums[i-2]<=k){
                for(int j=i-2;j<=i;j++){
                    arr[m][z]=nums[j]; 
                    z++;
                }
                m++;
            }
            else{
                return arr1;
            }
        }
        return arr;
    }
}