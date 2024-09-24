class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String str = "";

        String temp=strs[0];

        for(int i=0;i<temp.length();i++) {
            char letter = temp.charAt(i);
            boolean check=true;

            for(int j=0;j<n;j++) {
                String st=strs[j];
                if(st.length()<=i||st.charAt(i)!=letter){
                    check=false;
                    break;
                }
            };

            if(check){
                str += letter;
            }else{
                break;
            }
        }

        return str;
    }
}