public class Test6 {
    public static void main(String[] args) {
        //复制数组
        int[] arr = {1,2,3,4,5,6,7};
        int[] copyArr = copyOffRange(arr, 3, 7);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }

    }
    public static int[] copyOffRange(int[] arr,int from, int to){
        
        int[] newArr = new int[to - from];
        //伪造索引
        int index = 0;
        
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    } 
    
}
