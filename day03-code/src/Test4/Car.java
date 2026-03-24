package Test4;
//面向对象综合训练2
//定义数组储存三个对象!!!升级版!!!
//对象数据由键盘录入


public class Car {

    //成员变量
    private String brand;
    private int prize;
    private String coler;

    //生成标准javaBean
    //空参构造
    public Car() {
    }

    //全参构造
    public Car(String brand, int prize, String coler) {
        this.brand = brand;
        this.prize = prize;
        this.coler = coler;
    }

    //设置get和set方法

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }
}
