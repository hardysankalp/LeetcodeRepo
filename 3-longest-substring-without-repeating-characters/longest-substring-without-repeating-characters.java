class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0 , st = 0;
        HashMap<Character,Integer> m = new HashMap<>();
        for( int i = 0 ; i < s.length() ; i++){
            while(m.getOrDefault(s.charAt(i),0)==1){
                m.put(s.charAt(st),0);
                st++;
            }
            res = Math.max(res,i-st+1);
            m.put(s.charAt(i),1);
        }
        return res;
    }
}