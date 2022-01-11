package cn.csuft.day06.demo06;
//新版手机,使用老手机作为父类
public class NewPhone extends Phone{
    @Override
    public void show() {
        System.out.println("显示姓名");
        System.out.println("显示头像");
        //System.out.println("显示号码");
        super.show();//把父类的show方法拿过来反复使用
        //自己子类再来添加更多内容
    }
}
