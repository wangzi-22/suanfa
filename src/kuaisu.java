import java.util.Arrays;

public class kuaisu {
    public static void main(String[] args) {
        int[] ints = {20, 3, 5, 6, 75, 55, 4};
        quistSort(0,ints,ints.length-1);
        System.out.println(Arrays.toString(ints));
    }


    public static  void quistSort(int startindex ,int[] array,int endindex){
        if (startindex>=endindex){return;}
        int partation = partation(startindex, array, endindex);
        quistSort(partation+1,array,endindex);
        quistSort(startindex,array,partation-1);


    }
    public static int partation(int startindex ,int[] array,int endindex){
        int i = array[startindex];
        int left=startindex;
        int right=endindex;
        while (left != right){
            while(array[right]>array[startindex]&&left<right){
                right--;
            }
            while(array[left]<=array[startindex]&&left<right){
                left++;
            }
            if(left<right){
                int p=array[left];
                array[left]=array[right];
                array[right]=p;
            }
        }
        array[startindex]= array[left];
        array[left]=i;
        return left;
    }
}
