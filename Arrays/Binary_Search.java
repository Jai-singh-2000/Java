public class Binary_Search {

    // k is element to find , n is length of array
    int binarysearch(int arr[], int n, int k) {
        
        int l=0,r=n-1;
        while(l<=r)
        {
            // m == mid
            int m=(l+r)/2; 

            if(arr[m]==k)
            {
                return m;
            }else if(arr[m]>k)
            {
                r=m-1;
            }else if(arr[m]<k)
            {
                l=m+1;
            }
        }
        return -1;
    }
}

// Constraints: Array is sorted