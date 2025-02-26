

public class Solution3 {
    public static String toLowerCase(String s){
        char[] ch = s.toCharArray();

       for(int i=0; i<s.length();i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]=((char)(ch[i]+32));
            }
        }
        return new String(ch);
    }
    public static void main(String[] args){
        String s = "HeLlO";
        System.out.println(toLowerCase(s));
    }
}
