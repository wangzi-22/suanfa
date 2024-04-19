import java.util.*;

public class tongpaixu {
    public static void main(String[] args) {
        double[] doubles = {1.2, 2, 1, 3, 2.3, 3, 5, 4, 6, 7, 3, 1.2, 1.1, 1.2};
        double[] paixu = paixu(doubles);
        System.out.println(Arrays.toString(paixu));

    }
    public static final int tong=8;
    public static double[] paixu(double[] array){
        double max=array[0] ;
        double  min= array [0];
        //数组最大值
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=max){
                max=array[i];
            }
        }

        //数组最小值
        for (int i = 0; i < array.length; i++) {
            if (array[i]<=max){
                min=array[i];
            }
        }
        //创建桶
        ArrayList<LinkedList> linkedLists = new ArrayList<>();
        for (int i = 0; i < tong; i++) {
            linkedLists.add(new LinkedList<>());
        }
        //差值
        double chazhi=max -min;
        //区间大小
        double qujiam = chazhi/(tong-1);
        //查看落在哪一个区间 放在桶中
        for (int i = 0; i < array.length; i++) {
            int qujianindex = (int) ((array[i] - min) / qujiam);
            linkedLists.get(qujianindex).add(array[i]);

        }
        //桶中排序
        for (int i = 0; i < tong; i++) {
            Collections.sort(linkedLists.get(i));
        }
        //准备输出
        double[] doubles = new double[array.length];
        int index=0;
        for (LinkedList<Double> list:linkedLists) {
            for (Double A: list) {
               doubles[index]=A;
               index++;
            }

        }
        return  doubles;
    }
}
