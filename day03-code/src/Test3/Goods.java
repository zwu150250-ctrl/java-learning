package Test3;


//面向对象综合训练2
//定义数组储存三个对象


public class Goods {
    //成员变量
    //声明四个属性
    private String id;
    private String name;
    private double price;
    private int count;

    //空参构造

    public Goods() {
    }
    //有参构造

    public Goods(String id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }


    //提供get和set方法
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
