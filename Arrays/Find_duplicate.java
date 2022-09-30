// Find duplicates in an array

// Input:
// N = 5
// a[] = {2,3,1,2,3}
// Output: 2 3 sorted

// Input:
// N = 4
// a[] = {0,3,1,2}
// Output: -1
import java.util.*;
class Solution {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        
        for (Integer key : hm.keySet()) 
        {
            if(hm.get(key)>1)
            {
                pq.add(key);
            }
        }
        
        if(pq.size()==0)
        {
            list.add(-1);
            return list;
        }
        
        while(pq.size()>0)
        {
            list.add(pq.remove());
        }
        
        return list;
    }
}


//Not optimized solution