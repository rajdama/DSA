class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int[] lastAppeared = {-1,-1,-1};
        int left = 0;
        int right = 0;
        while(right<n){
            lastAppeared[s.charAt(right) - 'a'] = right;
            if(lastAppeared[0] >= 0 && lastAppeared[1] >= 0 && lastAppeared[2] >= 0){
                int min = Integer.MAX_VALUE;
                for(int i = 0; i<3; i++){
                    min = Math.min(min,lastAppeared[i]);
                }
                count = count + min + 1;
            }
            right++;
        }
        return count;
    }
}