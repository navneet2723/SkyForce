

public class Optimal {
    public static String defangIPadd(String s){
        StringBuilder sb = new StringBuilder("");
        int n = s.length();
        for(int i=0; i<n; i++){
            // if(s.charAt(i) == '.'){
            //     sb.append("[.]");
            // }else{
            //     sb.append(s.charAt(i));
            // }

            sb.append(s.charAt(i) == '.' ? "[.]" : s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "255.100.50.0";
        System.out.println(defangIPadd(s));
    }
}
