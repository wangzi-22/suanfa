import java.sql.Array;

public class jishu {
    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 2, 3, 1, 3, 43, 43, 45, 12, 12, 1, 2, 1, 2, 12, 1, 2, 22, 1, 2};
        jishupaixu(ints);
    }
    public static void  jishupaixu(int[] array ){
        int max =0;
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        int[] ints = new int[max+1];
        for (int i = 0; i <array.length; i++) {

           ints[array[i]]++;
        }
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i]; j++) {
                System.out.println(i);
            }
        }


    }




}
