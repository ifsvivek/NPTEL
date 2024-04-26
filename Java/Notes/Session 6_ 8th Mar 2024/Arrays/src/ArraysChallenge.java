import java.util.*;

public class ArraysChallenge {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println("Before Sorting = " + Arrays.toString(firstArray));
//        Arrays.sort(firstArray, Collections.reverseOrder());
//        System.out.println("After Sorting = " + Arrays.toString(firstArray));
        int[] sortedArray = sortIntegers(new int[] {7, 30, 35});
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newArray = new int[len];
        for(int i = 0; i < len; i++){
            newArray[i] = random.nextInt(100);
        }
        return newArray;
    }

    private static int[] sortIntegers(int[] array){

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("-------> " + Arrays.toString(sortedArray));
                }
            }
            System.out.println("---> " + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
