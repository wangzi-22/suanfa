import java.util.Arrays;

public class jishupaixu {
    public static void main(String[] args) {
        String[] strings = {"niha", "knjsk", "abd", "ab", "b", "c", "a","f","a"};
        System.out.println( Arrays.toString(jishu(strings,5)) );
    }
    public static String[] jishu(String[] array,int maxlength){
        //储存当前位的排序
        String[] strings = new String[array.length];
        //从最后一位开始遍历
        for (int j =maxlength-1; j >= 0; j--) {
            //创建计数排序的数组
                int[] ints = new int[128];
                //遍历数组
                for (int i = 0; i < array.length; i++) {
                    //调用方法找到该位置的字符串 应该按照当前位的值排队
                        int chazhaoindex = chazhao(array[i], j);
                        ints[chazhaoindex]++;
                }
                //把计数排序的数组 改为稳定的计数排序数组
                for (int i = 1; i < ints.length; i++) {
                    ints[i]=ints[i]+ints[i-1];
                }
                //从后开始遍历 计数排序数组的数字为当前值本次排序的序号 按照次序号放进 暂存的位序表中
                for (int i = array.length-1; i >=0 ; i--) {
                    //本轮位的下标
                    int chazhaoindex = chazhao(array[i], j);
                    //根据下标找到 计数数组的值 此值为 本轮位的次序
                    int anInt = ints[chazhaoindex]-1;
                    //把前位的次序 在缓存排序的数组中赋值
                    strings[anInt]=array[i];
                    //并把当前位所在的顺序计数数组中剪掉
                    ints[chazhaoindex]--;
                }
                array=strings.clone();
        }
        return array;
    }

    //看看此位置是否 有值没有值的话返回一个灵
    public static int chazhao(String  str,int j){

        if (str.length()<(j+1)){
             return  0;
         }
         return str.charAt(j);
    }
}
