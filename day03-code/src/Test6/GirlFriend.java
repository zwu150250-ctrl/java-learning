package Test6;

//面向对象综合训练4
//定义数组存储四个女朋友的对象
//计算平均年龄
//统计比平均年龄低的女朋友有几个,并打印出信息
public class GirlFriend {
    private String name;
    private int age;
    private String sex;
    private String hobby;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, String sex, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
