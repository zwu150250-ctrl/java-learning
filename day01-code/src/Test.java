public class Test {
    public static void main(String[] args) {
        //定义方法,比较两个长方形的面积
        //compare(20,10);
        double area1 = getArea(2.1,5.6);
        double area2 = getArea(5.3,7.1);
        if(area1<area2){
            System.out.println("area2 big");
        }else{
            System.out.println("area1 big");
        }
    }
   // public static void compare(int a,int b){
   //     if(a>b){
   //        System.out.println("a big");
   //    }else if(a == b){
   //         System.out.println("a = b");
   //     }else{
   //         System.out.println("b big");
   //     }
   // }
    public static double getArea(double len,double width){
        double area = len * width;
        return area;
    }
}
