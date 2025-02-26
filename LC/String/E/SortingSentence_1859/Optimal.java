

public class Optimal {
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sent = new String[words.length];
        StringBuilder sb = new StringBuilder();
        int index =0;
        for(String word : words){
           index = (int)(word.charAt(word.length()-1)-'0');
           int last = word.length()-1;
           sent[index-1] = word.substring(0,last);
        }
        for(int i =0; i<words.length-1;i++){
            sb.append(sent[i]).append(" ");
        }
        sb.append(sent[index]);
        return sb.toString();
    }
    public static void main(String[] args){
        String s ="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
