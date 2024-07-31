class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;
        int max = 1;
        while(high < s.length()){
            if(map.containsKey(s.charAt(high))){
                int ind = map.get(s.charAt(high));
                if(low <= ind){
                low = ind + 1;
                }
                map.put(s.charAt(high),high);
            }else{
            map.put(s.charAt(high),high);
            }
            max = Math.max(max,high-low+1);
            high++;
        }
        return max;
    }
}