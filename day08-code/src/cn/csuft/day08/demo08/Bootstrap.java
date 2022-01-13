package cn.csuft.day08.demo08;
//场景说明：
//红包发出去之后，所有人都要红包，大家抢光了之后，最后一个红包给群主自己
//红包分发的策略
//普通红包
//totalMoney/totalCount,余数在最后一个红包当中
//手气红包
//最少一分钱，最多不超过平均数的二倍。
//要做的事：设置一下程序的标题
//设置群主的名称
//设置分发策略
import cn.csuft.day08.red.OpenMode;
import cn.csuft.day08.red.RedPacketFrame;
public class Bootstrap {
    public static void main(String[] args) {
       MyRed myRed = new MyRed("标题");
       //设置群主名称
        myRed.setOwnerName("Lina");
        OpenMode normal = new NromalMode();//普通红包
        myRed.setOpenWay(normal);

    }
}
