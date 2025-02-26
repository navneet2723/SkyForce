/*
  space complexity--O(n)
  time complexity--O(n)--but better memory management
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optimal {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int res =0;
        int key=0;

        switch(ruleKey){
            case "type" : key=0; break;
            case "color" : key=1; break;
            case "name" : key=2; break;

        }
        for(List<String> item : items){
            if(item.get(key).equals(ruleValue)){
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
