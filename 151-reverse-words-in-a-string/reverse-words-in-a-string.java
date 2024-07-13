class Solution {
    public String reverseWords(String s) {
        String str = "";
        for (int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch != ' '){
                int end = i;
                while(s.charAt(i) != ' ' && i>0){
                    i--;
                }
                int start;
                if(i == 0){
                if(s.charAt(i) == ' '){
                start = i + 1;
                }
                else{
                    start = i;
                }
                }else{
                    start = i+1;
                    i = start - 1;
                }

                str = str + s.substring(start,end+1) + " ";               
            }
        }
        str = str.substring(0,str.length()-1);
        return str;
    }
}