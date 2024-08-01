class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int high = 0;
        HashMap<Character,Integer> mpp = new HashMap<>();
        int max = 0;
        while(high<s.length()){
            mpp.put(s.charAt(high),mpp.getOrDefault(s.charAt(high),0)+1);
            int maxf = 0;
            for(Integer value:mpp.values()){
                maxf = Math.max(maxf,value);
            }
            int changes = high - low + 1 - maxf;
            while(changes > k){
                mpp.put(s.charAt(low),mpp.get(s.charAt(low))-1);
                changes--;
                low++;
            }
            max = Math.max(max,high - low + 1);
            high++;
        }
        return max;
    }
}