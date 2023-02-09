import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] unsorted_array={9,5,4,2,4,5,5,6};
        boolean[] ideal_array=new boolean[unsorted_array.length];
        for(int a=0;a<ideal_array.length;a++){
            ideal_array[a]=true;
        }


        for(int i=0;i<unsorted_array.length;i++){
            int n=0;
            boolean[] array_test=new boolean[unsorted_array.length];
            while(n<unsorted_array.length){
                if (unsorted_array[i]==unsorted_array[n]||unsorted_array[i]<unsorted_array[n]){

                    array_test[n]=true;
                }

                else {

                    array_test[n]=false;
                }

                n++;
            }
            if(Arrays.equals(ideal_array,array_test)){
                System.out.println("The smallest number is "+unsorted_array[i]);
            }
            }



        }


    }