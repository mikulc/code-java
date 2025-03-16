package com.concepts;

public class ArrayAssign {
    public static void main(String[] args) {
    //基本数据类型的赋值，这个值就是具体的数据，不相互影响
        int n1 = 10;
        int n2 = n1;
        //此时先对n1的值进行拷贝后赋值给n2，所有n2的操作不会影响n1

    //数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用传递
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        //此时修改arr2会影响arr1

    }
}
