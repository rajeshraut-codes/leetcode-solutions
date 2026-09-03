class Solution {
    public boolean uniformArray(int[] nums1) {    
        int min=Integer.MAX_VALUE,n=nums1.length;
        if(n==1)
            return true;
        else{
            for(int i=0;i<n;i++){
                if(nums1[i]<min)
                min=nums1[i];
            }
            if(min%2==0){
            for(int i=0;i<n;i++)
            {
                if(nums1[i]%2==1)
                return false;
            }
            }
        }
        return true;
    
    }
}

  
