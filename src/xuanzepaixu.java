import java.lang.reflect.Array;
import java.util.Arrays;

public class xuanzepaixu {

    public static void main(String[] args) {

        int[] in = {10,9,8,7,9,10,20,30,60,80,4,1};
        xuanze(in);
        System.out.println(Arrays.toString(in));
    }
    public  static void xuanze(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            //设置初始最小值索引
            int aindex = i;
            //找到这次后面最小值的索引
            for (int a = i+1; a < array.length; a++) {
                if (array[aindex] > array[a]) {
                    aindex = a;
                }
            }
            //交换
            if (i!=aindex){
                int tem =array[aindex];
                array[aindex] = array[i];
                array[i] = tem;
            }
            //你无敌了孩子
        }
    }
}
