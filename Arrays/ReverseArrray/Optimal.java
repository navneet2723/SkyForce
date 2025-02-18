/*
    time complexity O(n)
    space complexity O(1)
*/
public class Optimal {
    public static void reverseArr(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverseArr(arr);

        for(int a : arr){
            System.out.println(a+" ");
        }
    }
}

