package LC.String.E.GoalParserInt_1678;
/*
  space complexity--O(n)
  time complexity--O(n)--but better memory management
*/

public class Optimal {
    public static String interpret(String command){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == 'G' ){
                sb.append("G");
            }else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                sb.append("o");
                i++;
            }else{
                sb.append("al");
                i+=3;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
}
