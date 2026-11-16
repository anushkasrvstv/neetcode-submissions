class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,
            max=0,
            res=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            max=Math.max(max,map.get(s.charAt(i)));
            while((i-left+1)-max>k){
                 char leftc=s.charAt(left);
                 map.put(leftc,map.get(leftc)-1);
                 left++;
            }
            res=Math.max(res,(i-left+1));
        }
  return res;
        
    }
}
