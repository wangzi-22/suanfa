import java.util.Arrays;

public class charupaixu {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 2, 3, 4, 46, 56, 75, 65,5,7};
        charu(ints);
        System.out.println(
                Arrays.toString(ints)
        );
    }
    public static void  charu(int[] array){
        //当前小于有序区的下标
        int temindex =0;
        //当前的值的缓存
        int tem = 0;
        for (int i = 0; i < array.length; i++) {
            //有序区
            tem=array[i];
            temindex=i;
            //当前值与有有序区比较并把值向后移动
            for (int j = i-1; j >=0 ; j--) {
                if (array[j]>tem){
                    array[j+1]=array[j];
                    temindex=j;
                }
            }
            array[temindex]=tem;
        }



    }
}
