package sorts;

import java.util.Arrays;

/**
 * SelectSort sort algorithm,
 * 原理：
 * 遍历0-n，选择一个最小的插入到第一个
 * 遍历1-n，选择一个最小的插入到第二个
 * 重复上述操作，直到有序
 * @author shixin
 * @date 2021/7/16 17:25
 */
public class SelectSort extends BaseInfo{

    public static void main(String[] args) {
        long oldTime = System.currentTimeMillis();
        selectSort(originalArray);
        System.out.println("最终 : "+Arrays.toString(originalArray));
        long newtTime = System.currentTimeMillis();
        System.out.println("时间 : "+(newtTime - oldTime));
    }

    public static void selectSort(int array[]){
        for (int i=0;i<array.length-1;i++){
            int index = i;
            for (int j=i+1;j<array.length;j++){
                if (originalArray[index]>originalArray[j]){
                    index = j;
                }
            }
            if (index!=i){
                originalArray[i] = originalArray[i]^originalArray[index];
                originalArray[index] = originalArray[i]^originalArray[index];
                originalArray[i] = originalArray[i]^originalArray[index];
            }
        }
    }
}
