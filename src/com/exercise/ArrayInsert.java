package com.exercise;

/**
 * 在一个数组中插入一个元素，并保持其顺序不变
 *
 * @since 2024-04-22
 */
public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = {10, 23, 56, 66};
        int insertNum = 77;
        int index = -1;

        //先遍历arr，找到要插入位置的下标索引
        for (int i = 0; i < arr.length; i++) {
            if (insertNum <= arr[i]) {
                index = i;
                break;  //找到就退出
            }
        }
        //创建一个新数组
        int[] arrNew = new int[arr.length + 1];
        //元素是最大的情况
        if (index == -1) {
            index = arrNew.length - 1;
        }
        //遍历新数组，再把原数组的元素遍历到新数组
        //i用来控制新数组，j用来控制原数组
        for (int i = 0, j = 0; i < arrNew.length; i++) {
            //当i = 2 时，不从原先数组拷贝，j++不执行
            //在程序中一般将执行频率较多放在if条件，而执行频率较少的放在else条件，这样可以减少性能的损耗和不必要的分支
            if (index != i) {
                arrNew[i] = arr[j];
                j++;
            } else {
                arrNew[i] = insertNum;
            }
        }
        //将原数组指向新数组
        arr = arrNew;

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
