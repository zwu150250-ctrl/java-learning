package Test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        //定义一个数组
        GirlFriend[] arr = new GirlFriend[4];

        //创建女朋友`对象
        GirlFriend gf1 = new GirlFriend("小小",18,"女","唱歌");
        GirlFriend gf2 = new GirlFriend("花花",25,"女","画画");
        GirlFriend gf3 = new GirlFriend("乐乐",19,"女","跳舞");
        GirlFriend gf4 = new GirlFriend("夫夫",22,"女","篮球");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum += gf.getAge();
        }

        int avg = sum /arr.length;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if(gf.getAge() > avg){
                System.out.println(gf.getName() + "," +gf.getAge()+ "," +gf.getSex()+ "," +gf.getHobby());
                count++;
            }
        }
        System.out.println("年龄大与平均值的有" + count+ "人");


    }
}
