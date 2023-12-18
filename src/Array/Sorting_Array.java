
package Array;


public class Sorting_Array {
    public static void main(String [] args){
        int[] array = {11, 2, 3, 5, 9, 4, 6, 10};
        
        int n = array.length;
        for(int a = 0; a < n - 1; a++){
            for (int b = 0; b < n - a - 1; b++){
                if(array[b] > array[b+1]){
                
                int temp = array[b];
                array[b] = array[b + 1];
                array[b+1] = temp;
            }
        }
        }
    
    System.out.print("Ascending Order: ");
        for(int value:array){
            System.out.print(value + " ");
}
}
}
