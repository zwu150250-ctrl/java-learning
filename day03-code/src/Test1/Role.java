package Test1;

import java.util.Random;
    //面向对象综合训练1
    //文字版格斗游戏


    //创建角色类
    public class   Role {

        //成员变量
        private String name;
        private int blood;

        //构造方法:在创建对象的时候给成员变量进行负赋值
        //生成空参
        public Role() {
        }

        //生成全参
        public Role(String name, int blood) {
            this.name = name;
            this.blood = blood;
        }
        //this的作用:区分局部变量和成员变量
        //this的本质:所在方法调用者的地址值

        //针对每一个私有化成员变量,写对应get和set方法
        //set方法:给成员变量赋值
        //get方法:获取成员变量的值
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBlood() {
            return blood;
        }

        public void setBlood(int blood) {
            this.blood = blood;
        }

        //成员方法
        //定义一个方法用于攻击别人
        //谁攻击谁?
        //Test1.Role r1 = new Test1.Role
        //Test1.Role r2 = new Test1.Role
        //r1.攻击(r2)
        //方法的调用者攻击参数



        //成员方法
        //创建攻击的方法
        //Role是类名,role是对象名
        public void  attack(Role role){
            //计算造成的伤害1~21
            Random r = new Random();
            int hurt = r.nextInt(200) +1;

            //修改一下挨揍人的血量
            //挨揍人生剩余血量
            int remainBlood = role.getBlood() - hurt;
            //对剩余血量做一个验证,如果为负数,修改为零
            remainBlood = remainBlood < 0 ? 0 : remainBlood;
            //修改一下挨揍人的血量
            role.setBlood(remainBlood);


            //this表示方法的调用者
            System.out.println(this.getName() + "举起拳头打了" + role.getName() + "一下" +
                    "造成了" + hurt + "点伤害" + role.getName() + "还剩下"  + remainBlood + "点血");

        }


    }




