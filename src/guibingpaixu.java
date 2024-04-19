import java.util.Arrays;

public class guibingpaixu {
    public static void main(String[] args) {
        int[] ints = {1, 3, 2, 7, 5, 3, 2, 2};
        fen(ints, 0, 7);
        System.out.println(Arrays.toString(ints));
    }
       ///分割
       //数组 开始下标 结束下标
       public static void fen(int[] array,int starindex,int endindex){
        //分的点,每次分完排好序 在放回原数组
        if (starindex<endindex){
            int i = (endindex+starindex) / 2;
            fen(array,starindex,i);
            fen(array,i+1,endindex);
            paixu(array,starindex,endindex,i);
        }
       }
       //比大小
    //数组 开始下标结束下标 分界线
       public static void   paixu(int[] array,int starindex,int endindex,int i){
           int[] ints = new int[endindex - starindex+1];
          int str=starindex;
          int end =i+1;
          int p=0;
          while ((str<=i)&&(end<=endindex)){
              if(array[str]<=array[end]){
                  ints[p++]=array[str++];
              }else {
                  ints[p++]=array[end++];
              }
          }
          while (end<=endindex){
              ints[p++]=array[end++];
          }
            while (str<=i){
                ints[p++]=array[str++];
            }
           for (int j = 0; j < ints.length; j++) {
              array[starindex+j]= ints[j];
           }

       }

}
