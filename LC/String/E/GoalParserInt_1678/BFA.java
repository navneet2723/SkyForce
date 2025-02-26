package LC.String.E.GoalParserInt_1678;
/*
  space complexity--O(n)
  time complexity--O(n)
*/

public class BFA {
    public static String interpret(String command){
        command = command.replace("()","o");
        command = command.replace("(al)","al");

        return command;
    }

    public static void main(String[] args){
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
}
