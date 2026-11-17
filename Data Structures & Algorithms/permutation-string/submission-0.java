class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
    HashMap<Character,Integer>map1=new HashMap<>();
    HashMap<Character,Integer>map2=new HashMap<>();
    for(int i=0;i<s1.length();i++){
        map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
    }
        if(map1.equals(map2)) return true;
        int left=0;
        for(int j=s1.length();j<s2.length();j++){
            char ch=s2.charAt(j);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            char leftc=s2.charAt(left);
            map2.put(leftc,map2.get(leftc)-1);
            if(map2.get(leftc)==0){
                map2.remove(leftc);
            }
            left++;
            if(map1.equals(map2)) return true;

        }
        return false;

    }    
    }

        
    
