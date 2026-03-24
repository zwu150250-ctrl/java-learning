package Test5;

//面向对象综合训练3
//定义数组储存三部手机对象
//手机的属性:品牌,价格,颜色
//要求:计算出三部手机的均价
public class Phone {

    //成员变量
    private String name;
    private int price;
    private String coler;

    //构造方法

    public Phone() {
    }

    public Phone(String name, int price, String coler) {
        this.name = name;
        this.price = price;
        this.coler = coler;
    }

    //创建get和set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }
}
