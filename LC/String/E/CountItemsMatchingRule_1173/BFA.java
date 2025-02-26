/*
  space complexity--O(n)
  time complexity--O(n)--but multipe comparisons
*/
import java.util.*;
public class BFA {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int res =0;
        for(int i=0; i<items.size(); i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)){
                res++;
            }
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)){
                res++;
            }
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        int result =countMatches(items, ruleKey, ruleValue);

        System.out.println(result);

    }
}
