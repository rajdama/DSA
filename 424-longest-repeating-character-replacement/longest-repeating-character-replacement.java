class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int high = 0;
        // HashMap<Character,Integer> mpp = new HashMap<>();
        int[] arr = new int[26];
        int max = 0;
        int maxf = 0;
        while(high<s.length()){
            // mpp.put(s.charAt(high),mpp.getOrDefault(s.charAt(high),0)+1);
            arr[s.charAt(high)-'A']++;
             maxf = Math.max(maxf, arr[s.charAt(high)-'A']);
            // for(Integer value:mpp.values()){
            //     maxf = Math.max(maxf,value);
            // }
            int changes = high - low + 1 - maxf;
            while(changes > k){
                // mpp.put(s.charAt(low),mpp.get(s.charAt(low))-1);
                 arr[s.charAt(low)-'A']--;
                changes--;
                low++;
            }
            max = Math.max(max,high - low + 1);
            high++;
        }
        return max;
    }
}