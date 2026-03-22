public class Test3 {
    public static void main(String[] args) {
        //定义方法,遍历数组
        int[] arr = {11,12,15,16,17,55};
        printArr(arr);
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }
}
