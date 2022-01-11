package cn.csuft.day06.demo05;
//方法的覆盖重写的注意事项：
//必须保证父子类之间的方法名称相同，参数列表也相同
//@Override，写在方法前面，用来检测是不是有效的覆盖重写。
//这个注解就算不写，只要满足要求，也是正确的方法覆盖重写
//子类方法的【返回值】必须【小于等于】父类方法的返回值范围
//java.lang.Object类是所有类的公共最高父类（祖宗类），java.lang.String就是Object的子类
//子类方法的【权限】必须【大于等于】父类方法的权限修饰符
//提示：public>protected>（default）>private
//备注：(default) 不是关键字 default ,而是什么都不写，留空
public class Demo01Override {

}
