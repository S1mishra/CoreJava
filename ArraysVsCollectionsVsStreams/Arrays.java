package ArraysVsCollectionsVsStreams;

public class Arrays{
    public static void main(String[] args){
        int[] array = new int[25];
        for(int i=0; i<25; i++){
            array[i] = i;
            System.out.println(array[i]);
        }
        //sum of elements in array
        int sum = 0;
        for(int i=0; i<array.length; i++){
            //sum = sum + array[i];
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }
}
