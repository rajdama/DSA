class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        for(int i=0; i<s.length(); i++){
            int[] arr = new int[26];
            int maxf = 0;
            for(int j=i; j<s.length(); j++){
                arr[s.charAt(j)-'A']++;
                maxf = Math.max(maxf,arr[s.charAt(j)-'A']);
                int changes = j-i+1 - maxf;
                if(changes <= k){
                    max = Math.max(max,j-i+1);
                }else{
                    break;
                }
            }
        }
    return max;
    }
}