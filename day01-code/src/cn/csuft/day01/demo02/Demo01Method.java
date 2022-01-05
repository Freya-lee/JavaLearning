package cn.csuft.day01.demo02;

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }
        public static void printMethod() {
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < 20; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

}
//方法格式：
//public static void 方法名称(){
// 方法体
// }
//调用格式：
//方法名称（）；
// 注意事项：
//方法的定义与先后顺序无关
//方法的定义必须是挨着的，不能在一个方法内部定义另一个方法
//方法定义之后不会自己执行，需要调用才能执行