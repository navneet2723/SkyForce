

public class BFA {
    public static String defangIPadd(String s){
        //return s.replace(".","[.]");
        //return s.replaceAll("\\.","[.]");
        return String.join("[.]", s.split("\\."));

    }

    public static void main(String[] args){
        String s = "255.100.50.0";
        System.out.println(defangIPadd(s));
    }
}
