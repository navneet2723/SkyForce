public class SolUsingGeneric {

    static class Pair<T,U>{
        T min;
        U max;

        public Pair(T min, U max){
            this.min=min;
            this.max=max;
        }

        public T getMin(){
            return min;
        }

        public U getMax(){
            return max;
        }
    }

    public static Pair<Integer,Integer> findMinMax(int[] arr){
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
       return new Pair<>(min,max);
    }


    public static void main(String[] args){
        int[] arr = {3,2,1,56,10000,167};
        Pair result = findMinMax(arr);

        System.out.println(result.getMin());
        System.out.println(result.getMax());
    }
    
}
