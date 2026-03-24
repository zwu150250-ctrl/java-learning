package Test7;

public class StudentTest2 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1,"张三",19);
        Student stu2 = new Student(2,"李四",18);
        Student stu3 = new Student(3,"王五",19);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //要求三
        int index = getIndex(arr,2);
        System.out.println(index);
        if(index >= 0){
            arr[index] = null;
            //要求四
            printArr(arr);//遍历数组
        }else{
            System.out.println("当前id不存在,删除失败");
        }
    }

    //找到id在数组中的索引
    public static int getIndex(Student[] arr,int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return i;
                }
            }
        }
        //循环结束之后,还没有找到,表示不存在
        return -1;
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
}
