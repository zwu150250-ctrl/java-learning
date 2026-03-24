package Test2;

import java.sql.SQLOutput;
import java.util.function.DoubleFunction;

public class Test {

    public static void main(String[] args) {
        //新输出语句介绍souf
        //第一部分参数:要输出的内容%s,%s表示占位
        //第二部分参数:填充数据,替代%s


        System.out.printf("你好啊%s","张三");//你好啊张三
        System.out.println();//表示换行
        System.out.printf("%s说你好啊%s","张三","李四");//张三说你好啊李四
    }
}
