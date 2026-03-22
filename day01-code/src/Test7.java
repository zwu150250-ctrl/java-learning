import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //卖飞机票

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的交钱");
        int ticket = sc.nextInt();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入购买的舱位0头等舱1经济舱");
        int seat = sc.nextInt();

        if(month >= 5 && month <=10){
            //旺季
           ticket = getPrice(ticket,seat,0.9,0.85);
        }else if(month >= 1 && month <= 4 || month >= 11 && month <= 12){
            //淡季
            ticket = getPrice(ticket,seat,0.7,0.65);
        }else{
            System.out.println("输入错误");
        }
        System.out.println(ticket);
    }
    public static int getPrice(int ticket,int seat,double v0,double v1){
        if(seat == 0){
            ticket =(int)( ticket * v0);
        }else if(seat == 1){
            ticket =(int)( ticket * v1);
        }else{
            System.out.println("没有这个舱位");
        }
        return ticket;
    }

}
