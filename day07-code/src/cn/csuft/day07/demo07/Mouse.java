package cn.csuft.day07.demo07;

public class Mouse implements USBInterface{
    @Override
    public void openEquipment() {
        System.out.println("打开鼠标");
    }

    @Override
    public void closeEquipment() {
        System.out.println("关闭鼠标");
    }
    //鼠标特有的点击方法
    public void click(){
        System.out.println("鼠标点击");
    }
}
