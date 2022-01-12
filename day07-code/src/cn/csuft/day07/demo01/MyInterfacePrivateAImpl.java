package cn.csuft.day07.demo01;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA{
    public static void main(String[] args) {

    }
    public void  methodAnther(){
      //  methodCommon();//这样就直接访问到了接口中的默认方法，
        // 这样是错误的，因为common只是为了另外两个方法存在的
    }

}
