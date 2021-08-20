package sorts;

import java.util.Arrays;

/**
 * 快速排序
 * 原理：
 * 选第一个为基准数基准数，再选出两个索引，分别是第一个和最后一个，右边的数左移过滤大于基准的数，直到小于基准,交换；左边的索引右移过滤小于基准的数，直到大于基准，交换，循环往复即可
 * 需要注意的是最后可能会出现arr[i]==arr[j]但是i!=j的情况，所以需要手动让i++或者j--
 * @author INHE0985
 * @date 2021/8/20 8:22
 */
public class QuickSort extends BaseInfo{

    public static void main(String[] args) {
        long oldTime = System.currentTimeMillis();
        quickSort(originalArray,0,originalArray.length-1);
        System.out.println("最终 : "+ Arrays.toString(originalArray));
        long newtTime = System.currentTimeMillis();
        System.out.println("时间 : "+(newtTime - oldTime));
    }

    public static void quickSort(int array[],int start,int end){
        int ref = array[start];
        int left = start;
        int right = end;
        while (left<right){
            while (array[right]>ref&&left<right){
                right--;
            }
            while (array[left]<ref&&left<right){
                left++;
            }
            if (array[left]==array[right]&&left<right){
                left++;
            }else {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
            if (left>start){
                quickSort(array,start,left-1);
            }
            if (right<end){
                quickSort(array,right+1,end);
            }
        }

    }
}
