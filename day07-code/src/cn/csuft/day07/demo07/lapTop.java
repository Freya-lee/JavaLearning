package cn.csuft.day07.demo07;

public class lapTop {
    public void openLapTop(){
        System.out.println("笔记本开机");
    }
    public void closeLapTop(){
        System.out.println("笔记本关机");
    }
    public void useUSBEquipment(USBInterface usbInterface){
     //   System.out.println("使用USB设备功能");
        usbInterface.openEquipment();
        usbInterface.closeEquipment();
    }
}
