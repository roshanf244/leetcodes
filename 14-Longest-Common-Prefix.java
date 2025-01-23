class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        int minlen = 201;
        for(String str : strs){
            minlen = Math.min(minlen,str.length());
        }
        for(int i=0; i<minlen; i++){
            char strt = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(strs[j].charAt(i) != strt){
                    return res.toString();
                }
            }
            res.append(strt);
        }
        return res.toString();
    }
}