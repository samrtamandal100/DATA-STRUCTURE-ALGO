class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashSet<String> set = new HashSet<>();
        per(s1 ,"" ,set);
        int lth =s1.length();  
        String sub="";
        
        int j=0;
        for(int i=lth;i<=s2.length();i++)
        {
           
          sub =s2.substring(j,i);
           if(set.contains(sub))
                return true;
             j++;
        }
        
        return false;
        
    }
    
    public void per(String s ,String copy ,HashSet<String> set)
    {
        
        if(s.length()==0)
        {
            set.add(copy);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            String data =s.substring(0,i)+ s.substring(i+1);
            per(data ,copy+ch,set);
            
        }
    }
}