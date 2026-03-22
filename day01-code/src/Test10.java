public class Test10 {
    public static void main(String[] args) {
        //把一个数组中的元素复制到另一个数组中
        int[] arr1 = {1,2,3,4,5,6};
        int[] newArr = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            //i 表示老数组的索引,也可以表示新数组的索引
            newArr[i] = arr1[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
}
