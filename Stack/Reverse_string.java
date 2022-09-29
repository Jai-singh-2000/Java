    public String reverse(String S){

       StringBuilder sb=new StringBuilder();
       Stack<Character> st=new Stack<Character>();
       
       for(int i=0;i<S.length();i++)
       {
           st.push(S.charAt(i));
       }
       
       for(int i=0;i<S.length();i++)
       {
           sb.append(st.pop());
       }
       return sb.toString();
    }




