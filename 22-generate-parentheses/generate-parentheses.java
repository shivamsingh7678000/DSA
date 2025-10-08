class Solution {
    public List<String> generateParenthesis(int n) {
        int openB=0, closeB=0;
        List<String>ans=new ArrayList<>();

        helper(n,openB,closeB,"",ans);
        return ans;
    }    

    private void helper(int n,int open,int close,String s,List<String>ans){
        if(open+close==2*n)
        {
            ans.add(s);
            return;

        }
        if(open<n)
        {
            helper(n,open+1,close,s+"(",ans);

        }
        if(close<open)
        {
            helper(n,open,close+1,s+")",ans);
        }
        
        
    }
}