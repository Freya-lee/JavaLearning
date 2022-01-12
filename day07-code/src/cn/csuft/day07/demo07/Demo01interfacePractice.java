package cn.csuft.day07.demo07;
//案例分析
//进行描述笔记本类，实现笔记本使用USB鼠标，USB键盘
//USB接口，包含打开设备功能，关闭设备功能
//笔记本类，包含开机功能，关机功能，使用USB设备功能
//鼠标类，要实现USB接口，并具备点击的方法
//键盘类，要实现USB接口，具备敲击的方法
public class Demo01interfacePractice {
    public static void main(String[] args) {
        lapTop lapTop = new lapTop();
        lapTop.openLapTop();
        //准备一个鼠标，供电脑使用
        Mouse mouse = new Mouse();
        //首先向上转型
        USBInterface usbInterface = (USBInterface) mouse;
        lapTop.useUSBEquipment(usbInterface);
        //现在使用鼠标点击
        //向下转型
        Mouse mouse1 = (Mouse) usbInterface;
        mouse1.click();
        //新建一个键盘
        KeyBoard keyBoard = new KeyBoard();
        //打开键盘
        //上转
        USBInterface usbInterface1 = (USBInterface) keyBoard;
        lapTop.useUSBEquipment(usbInterface);
        lapTop.useUSBEquipment(usbInterface);
        //使用键盘敲击
        //下转
        KeyBoard keyBoard1 = (KeyBoard) usbInterface1;
        keyBoard1.daDaDa();
        lapTop.closeLapTop();





    }

}
