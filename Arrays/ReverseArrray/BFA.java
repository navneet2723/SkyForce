/*
    time complexity O(n)
    space complexity O(n)
*/

public class BFA {

    public static int[] reverseArr(int[] arr){
        int[] newArr = new int[arr.length];
        int j =0;
        for(int i = arr.length-1; i>=0; i--){
            newArr[j++] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] array = reverseArr(arr);

        for(int a : array){
            System.out.print(a+" ");
        }
    }
}
