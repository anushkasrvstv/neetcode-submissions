class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
       // List<String>list=new ArrayList<>();
       // for(int i=0;i<strs.length();i++){
           // for(int j=i+1;j<strs.length();j++){
        for(String s: strs){
           char [] ch =s.toCharArray();
            //map.put(ch,map.getOrDefault(ch,0)+1);
           Arrays.sort(ch);
           String key=new String(ch);
           map.putIfAbsent(key,new ArrayList<>());
           map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
        
        }
        //if(map[i].equals(map[j])){
          //  list.add()

        }
        


       

