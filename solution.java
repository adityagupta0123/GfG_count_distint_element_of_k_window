class Solution
{
    ArrayList<Integer> countDistinct(int a[], int n, int k)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < k -1; i++)
          map.put( a[i], map.getOrDefault( a[i], 0) + 1);
        
        for(int j=0,i = k-1; i <n; i++){
            map.put(a[i],map.getOrDefault(a[i],0) + 1); //accure
            list.add(map.size());//put
            
            int freq = map.get(a[j]);//release
            if(freq == 1){
                map.remove(a[j]);
            } else {
                map.put(a[j], freq - 1);
            }
            j++;
        }
        
        return list;
    }
}
