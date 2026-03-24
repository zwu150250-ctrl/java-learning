package Test5;

public class PhoneTest {
    public static void main(String[] args) {
        //创建数组
        Phone[] arr = new Phone[3];

        //创建手机对象
        Phone p1 = new Phone("小米",1999,"黑色");
        Phone p2 = new Phone("苹果",5999,"蓝色");
        Phone p3 = new Phone("华为",5999,"绿色");

        //将手机对象放入数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //获取三部手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            phone.getPrice();
            sum += phone.getPrice();
        }

        int avg = sum /arr.length;
        System.out.println(avg);




    }
}
