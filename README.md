## 这主要记录我从0开始学习java的每一天写的一些代码和小笔记  



配套的教程是b站的一个999个视频的java教程,链接在下面  


[java基础+进阶](https://www.bilibili.com/video/BV1uJ411k7wy?p=84&spm_id_from=pageDriver)  
  
每天都会学一点点然后推送到github上面。
没有什么特别大的作用主要是记录  

# 2022.1.5
今天第一天学Java，发现很多的东西都忘记了。  

最基本的输入输出，方法在那块定义都忘记了。  

所以只能当小白第一个学。顺便复习了以下git的一些命令  

啊，忘记了好多东西
不知道现在才开始学还来不来得及
先专心学java把
把其他的事情放一边去。  

# 2022.1.6
java内存的划分  

java的内存其实可以划分为5个部分  

+ 栈内存（Stack）：存放的都是方法中的局部变量。方法的运行一定要在栈当中。  



>> 局部变量：方法的参数，或者方法{}内部的变量  

>> 作用域：一旦超出作用域，立刻从栈内存中消失  


+ 堆内存（Heap）：凡是new出来的东西，都在堆当中  



  
>> 堆内存里面的东西都有一个地址值：16进制  

>> 堆内存的数据都有默认值，规则：    

>> 如果是整数类型，默认为0  

>> 如果是浮点类型，默认为0。0  

>> 如果是字符类型，默认为'/u0000'  

>> 如果是布尔类型，默认为false  
 
>> 如果是引用类型，默认为null  

+ 方法区（Method Area） ：存储.class相关信息，包含方法信息。  
>> 你叫什么名字啊？你的参数是什么啊？ 返回类型是什么啊？

+ 本地方法栈（Native Method Stack）：与操作系统相关  

+ 本地寄存器（PC Register）：与CPU相关




今天比昨天学的久一点，希望明天不要睡这么久了，早点起来学习啊！！  
今天学的是数组，但是还没有学完数组可能要拖到明天啦  
# 2022.1.7
 今天把数组相关的基础知识复习完了  
 其中数组转置的方法是我自己写的，可能有很多不对的地方，跟视频里面写的是不一样的
> 任何数据类型都可以作为方法的参数类型，或者返回值类型
> 但是数组作为参数的时候，给到方法的是数组的地址值，作为返回值的时候，返回的其实也是数组的地址值  

怎么老不会用git好烦,怎么每次都要出问题!!  
刚刚用了强制覆盖，git push -u origin main -f才把代码推送上去
现在我在推送一次，代码，推送的时候注释为fifth commit  我就不信我推不上去

