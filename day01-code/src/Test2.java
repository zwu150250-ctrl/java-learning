public class Test2 {
    public static void main(String[] args) {
        //使用方法重载思想,设计比较两个整数是否相同的方法
        //要求:兼容全整数类型(byte,short,int,long)

        compare((byte)20,(byte)50);
    }
    public static void compare(byte a,byte b){
        System.out.println("byte");
        System.out.println(a == b);
    }

    public static void compare(int x,int y){
        System.out.println("int");
        System.out.println(x == y);
    }

    public static void compare(short n,short m){
        System.out.println("short");
        System.out.println(n == m);
    }

    public static void compare(long t,long h){
        System.out.println("long");
        System.out.println(t == h);
    }
}
