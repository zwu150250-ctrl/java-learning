public class Test5 {
    public static void main(String[] args) {
        //判断数字在数组中是否存在
        int[] arr = {2,6,8,99,55,66};
        Boolean flag = contains(arr,55) ;
        System.out.println(flag);
    }
    public static boolean contains(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target ){
                return true;
            }
        }
        return false;
    }
}
