package cn.csuft.day08.demo07;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        //左边的是接口名称，右边的是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();

        List<String> result  = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));

        }

    }
    public static List<String> addNames(List<String> list){
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        return  list;
    }
}
