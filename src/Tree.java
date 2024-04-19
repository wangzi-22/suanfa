import java.util.ArrayList;
import java.util.Arrays;

public class Tree {
    public static erchashu build(ArrayList A) {
        for (Object b : A) {
            int b1 = (int) b;
            if (b1 != 0) {


                erchashu erchashu = new erchashu(b1);
                erchashu.left = build(A);
            }
        }


   return  null;
    }




    public  static void upAjust(int[] array){
        int haiziIndex =array.length-1;
        int fumuIndex = (haiziIndex-1)/2;
        int teme =array[haiziIndex];
        while (haiziIndex >0 &&teme<array[fumuIndex] ){
            array[haiziIndex]=array[fumuIndex];
           haiziIndex= fumuIndex;
           fumuIndex= (haiziIndex-1)/2;
        }
      array[haiziIndex]=teme;

    }

    public static void  downAjust( int[] array , int parentIndex ,int length  ) {
        int tem = array[parentIndex];
        int haiziIndex =( (parentIndex * 2) + 1);
        int haizi = array[haiziIndex];
        while (haiziIndex < length) {
            if (haiziIndex + 1 < length && haizi > array[haiziIndex + 1]) {
                haiziIndex++;
            }
            if (tem<=array[haiziIndex]){
                break;
            }
            array[parentIndex]=array[haiziIndex];
            parentIndex=haiziIndex;
            haiziIndex=(parentIndex * 2) + 1;

        }
        array[parentIndex]=tem;
    }
    public static  void buidHeap(int[] array){


        for (int i = (array.length-2)/2; i >=0 ; i--) {
             downAjust(array,i,array.length);
        }

    }

    public static void main(String[] args) {
        int[]  array=new  int[]{ 10,9,8,7,6,5,4,99,88};
        buidHeap(array);
        System.out.println(Arrays.toString(array));

        int[] ints = new  int[] {0,7, 6, 10,11,12,15,17,4};
        //buidHeap(ints);
        upAjust(ints);
        System.out.println(Arrays.toString(ints));
    }



















}















