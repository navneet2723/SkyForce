

public class BFA {
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sent = new String[words.length];

        for(String word : words){
           int index = (word.charAt(word.length()-1)-'0');
           int last = word.length()-1;
           sent[index-1] = word.substring(0,last);
        }
        return String.join(" ",sent);
    }
    public static void main(String[] args){
        String s ="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
