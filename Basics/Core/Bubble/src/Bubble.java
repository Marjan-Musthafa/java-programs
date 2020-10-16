import java.util.Scanner;

public class Bubble {
    public static void search(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n -1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j,array);

                }
            }
        }
            display(array);
    }
   public static void swap(int j,int[] array){
    int temp;
    temp = array[j];
    array[j] = array[j + 1];
    array[j + 1] = temp;
}

    public static void display(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(" "+array[i]+" ");
        }

    }
    public static void main(String[] args){
        int[] array={7,6,5,4,3,2,1};
        search(array);
    }

}
