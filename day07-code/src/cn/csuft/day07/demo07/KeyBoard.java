package cn.csuft.day07.demo07;

public class KeyBoard implements USBInterface{
    @Override
    public void openEquipment() {
        System.out.println("打开键盘");
    }

    @Override
    public void closeEquipment() {
        System.out.println("关闭键盘");
    }
    public void daDaDa(){
        System.out.println("键盘敲击");
    }
}
