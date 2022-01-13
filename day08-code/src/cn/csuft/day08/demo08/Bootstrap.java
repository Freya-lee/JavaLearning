package cn.csuft.day08.demo08;
//场景说明：
//红包发出去之后，所有人都要红包，大家抢光了之后，最后一个红包给群主自己
//红包分发的策略
//普通红包
//totalMoney/totalCount,余数在最后一个红包当中
//手气红包
//最少一分钱，最多不超过平均数的二倍。
import cn.csuft.day08.red.RedPacketFrame;
public class Bootstrap {
    public static void main(String[] args) {
       MyRed myRed = new MyRed("标题");

    }
}
