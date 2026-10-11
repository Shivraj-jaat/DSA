class Solution {
public String remove(String s){
    int n = s.length();
    StringBuilder sb = new StringBuilder("");
  

    for(int i=0; i<n; i++){
       char ch = s.charAt(i);
      if(ch == '#'){
        int len = sb.length();
        if(len > 0)  sb.deleteCharAt(len-1);
     }
      else{
          sb.append(ch);
      }
    }
    return new String(sb);
}

    public boolean backspaceCompare(String s, String t) {
        String sb = remove(s);
        // sb.reverse();
        String sf = remove(t);
        // sf.reverse();

        
        // int n = Math.min(sb.length(), sf.length());
        // boolean isAns = true;

        // for(int i=0; i<n; i++){
        //     char ch1 = sb.charAt(i);
        //     char ch2 = sf.charAt(i);

        //     if( ch1 != ch2){
        //         isAns = false;
        //     }
        // }
        // return isAns;

        if(sb.equals(sf)) return true;
        return false;
     
    }
}