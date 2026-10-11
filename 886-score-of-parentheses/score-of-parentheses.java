class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(cnt);
                cnt=0;
            }else{ // => ')'
                int prev = st.pop();
                if(cnt==0){
                    cnt=1;
                }else{
                    cnt*=2;
                }
                cnt+=prev;
            }
        }
        return cnt;
    }
}