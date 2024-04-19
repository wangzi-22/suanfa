import java.util.Arrays;

public class xierpaixu {
    public static void main(String[] args) {
        int[] ints = {80,2,2,2,1,6,5,4,3,2,1};
        xier(ints);
        System.out.println(Arrays.toString(ints));
    }
    public  static void  xier(int [] array){
       int d= array.length;
       while (d>1){
           d=d/2;
           //相当于遍历每个组然后对每个组进行插入排序
           for (int i = 0; i <d ; i++) {
               //遍历一个组里的每一个数据
               for (int j = i+d; j <array.length ; j=j+d) {
                   int mindex=j;
                   int tem=array[j];
                   //查看当前组的当前数据是否比前面的数据小 如果小就记录并一点点复制交换
                   for (int k = j-d; (k >=0) &&(tem <array[k]); k=k-d) {
                       mindex= k;
                       array[k+d]=array[k];
                   }
                   array[mindex]=tem;
               }
           }
       }
    }
}
