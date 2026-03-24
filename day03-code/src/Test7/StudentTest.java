package Test7;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1,"张三",19);
        Student stu2 = new Student(2,"李四",18);
        Student stu3 = new Student(3,"王五",19);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求1
        Student stu4 = new Student(4,"赵六",20);
        //数组存满 ----- 创建一个数组,新数组长度为老数组 + 1
        //数组没存满 -----直接添加
        boolean flag = contains(arr,stu4.getId());
        if(flag){
            //已经存在
            System.out.println("repeat");
        }else {
            //不存在,添加进数组
            //判断数组是否存满
            int count = getCount(arr);
            if (count == arr.length) {
                //存满了
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                //要求2
                printArr(newArr);

            } else {
                //没有存满
                //getcount收获到的是2,表示当前数组中已经有两个元素了
                //还有另一层意思,如果下一次你要添加数据,就是添加到2索引的位置
                arr[count] = stu4;
                //要求2
                printArr(arr);
            }
        }


    }
    //定义一个遍历数组的方法
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(arr[i] != null){
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }



    //定义一个方法,表示创建新数组
    public static Student[]  creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //将老数组中的元素添加到新数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }




    //定义一个方法,判断数组中已经存了几个元素
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }



    //创建一个唯一性判断方法
    public static boolean contains(Student[] arr,int id) {
        for (int i = 0; i < arr.length; i++) {
            //依此获得数组里每一个学生对象

            Student stu = arr[i];
            //进行非空判断
            if (stu != null) {
                //获得数组中学生对象的id;
                int sid = stu.getId();
                //比较
                if (sid == id) {
                    return true;
                }
            }

        }
        return false;
    }
}
