class Solution {
    public String largestOddNumber(String num) {
        String str = "";
        String maxStr = "";
        for (int i = 0; i<num.length(); i++){
            int val = (int) num.charAt(i);
            if(val%2 != 0){
                str = str + num.charAt(i);
                if(str.length() > maxStr.length()){
                maxStr = str;
                }
            }else{
                if(i != num.length() - 1){
                    str = str + num.charAt(i);
                }
            }
        }
        return maxStr;
    }
}