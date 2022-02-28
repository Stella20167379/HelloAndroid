# HelloAndroid
关于使用安卓部件进行开发的各种尝试
（ win+. 快捷键打开表情符号）

一、布局尝试🎃😋🧙‍♂️🧨
👉LinearLayout布局：
   1.在activity_main.xml中是对LinearLayout布局的示例实践
   2.创建了ActivityCollector管理活动类，BaseActivity集成基础共性
👉RelativeLayout布局：
   1.见SecondActivity.java和activity_second.xml文件
👉ListView实践：
   1.点击MainActivity.java中的开始测试按钮，打开ThirdActivity.java，其绑定了activity_third.xml
   2.fruit_item.xml为listview中item项的布局样式
   3.有个listView包，其中FruitAdapter_V2.java是FruitAdapter.java的改进版，两者实现了相同的功能
