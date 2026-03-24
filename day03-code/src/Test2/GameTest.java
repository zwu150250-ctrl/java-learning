package Test2;

public class GameTest {
    public static void main(String[] args) {
        //1.创建第一个角色
        Role r1 = new Role("邢雨心",100,'女');
        //2.创建第二个角色
        Role r2 = new Role("陈佳慧",100,'男');

        //开始格斗
        while(true){
            //r1攻击r2
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }

            //r2攻击r1
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }
    }
}
