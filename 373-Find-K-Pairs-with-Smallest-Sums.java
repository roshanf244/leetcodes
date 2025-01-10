class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Queue<int []> pq = new PriorityQueue<>(
            (p1, p2) -> ((p2[0] + p2[1]) - (p1[0] + p1[1]))); 
    
        int i,j; 

        for ( i=0; i < nums1.length; i++)
        {
            for ( j=0; j < nums2.length; j++)
            {
               pq.add(new int[]{nums1[i], nums2[j]});
                
               if (pq.size() > k) 
               {
                  int[] pair = pq.poll(); 
                  if (nums1[i] == pair[0] && nums2[j] == pair[1]) 
                    break;
               }
            }

            if (j == 0) 
             break; 
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        while (pq.size() > 0)
        {
            int[] pair = pq.poll(); 
            ans.add(Arrays.asList(pair[0], pair[1]));
        }
        return ans;
    }
}