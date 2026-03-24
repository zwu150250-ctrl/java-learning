package Test7;

//面向对象综合训练5
//定义一个长度为三的数组,数组存储1~3名对象作为初始数据,学生对象的姓名,学号各不相同
//学生的属性:学号,姓名,年龄
//要求1:再添加一个学生对象,并在添加的时候进行学号唯一判断
//要求2:添加完毕后,遍历所有学生信息
//要求3:通过id删除学生信息,存在删除,不存在提示删除失败
//要求4:删除完毕后,遍历所有学生信息
//要求5:查询数组id为"2"的学生,如果存在,年龄加一

public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
