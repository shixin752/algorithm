package sorts;

import java.util.Arrays;

/**
 * Bubble sort algorithm
 * 时间复杂度O(n^n)
 * 原理：
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * @author shixin
 * @date 2021/7/16 17:25
 */
public class BubbleSort extends BaseInfo{

    public static void main(String[] args) {
        long oldTime = System.currentTimeMillis();
        bubbleSort(originalArray);
        System.out.println("最终 : "+Arrays.toString(originalArray));
        long newtTime = System.currentTimeMillis();
        System.out.println("时间 : "+(newtTime - oldTime));
    }

    public static void bubbleSort(int array[]){
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (originalArray[j]>originalArray[j+1]){
                    originalArray[j] = originalArray[j]^originalArray[j+1];
                    originalArray[j+1] = originalArray[j]^originalArray[j+1];
                    originalArray[j] = originalArray[j]^originalArray[j+1];
                }
            }
        }
    }
}
