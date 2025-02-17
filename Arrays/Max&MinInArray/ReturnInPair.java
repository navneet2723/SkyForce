public class ReturnInPair {
    
    static class Pair{
        int min;
        int max;

        public Pair(int min, int max){
            this.min=min;
            this.max=max;
        }

        public int getMin(){
            return min;
        }

        public int getMax(){
            return max;
        }
    }

    public static Pair findMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

       for(int i =0; i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
       }
       return new Pair (min,max);
    }


    public static void main(String[] args){
        int[] arr = {3,2,1,56,10000,167};
        Pair result = findMinMax(arr);

        System.out.println(result.getMin());
        System.out.println(result.getMax());
    }
}
