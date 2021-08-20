package sorts;

import java.util.Arrays;

/**
 * 把第一个当成是有序的，然后把第二个插入有序集合
 * 把第三个插入前面的有序集合
 * 把第四个插入前面的有序集合
 * 实际上就是遍历列表，一个个插入前面的已经排好序的集合里
 * @author INHE0985
 * @date 2021/8/19 16:50
 */
public class InsertSort extends BaseInfo{

    public static void main(String[] args) {
        long oldTime = System.currentTimeMillis();
        insertSort(originalArray);
        System.out.println("最终 : "+ Arrays.toString(originalArray));
        long newtTime = System.currentTimeMillis();
        System.out.println("时间 : "+(newtTime - oldTime));
    }

    public static void insertSort(int array[]){
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (originalArray[j]<originalArray[j-1]){
                    originalArray[j] = originalArray[j]^originalArray[j-1];
                    originalArray[j-1] = originalArray[j]^originalArray[j-1];
                    originalArray[j] = originalArray[j]^originalArray[j-1];
                }
            }
        }
    }
}
