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
📢📢📢以下两点是个人理解🦸‍♀🥰
   4.自定义JavaBean（ Fruit类）保存水果对象信息，FruitAdapter将数据对象（Fruit类）转换为视图组件item（View类），交由ListView组件组合显示。FruitAdapter即转换器，为ListView的工具类。
   5.FruitAdapter_V2中，自定义ViewHolder内部类用以保存item对应的各个view类子组件。convertView大概是item的缓存？（不确定）总之view组件都是能复用的，使用例如setImageResource()方法即可更换其绑定的数据。每将屏幕外的item滑进显示区域时，便调用getView方法（网上说的），于是，假设此时item1号滑出，item7号滑入，则item1号对应的convertView闲置，可用于绑定item7号对应的数据，此时只需将convertView对应的view对应的viewHolder取出，更换其绑定的数据即可。
   
👉RecyclerView实践：
   1.创建svg矢量图 => 转换为png图片 => 转换为.9格式。得到聊天框素材：dialog_left.9.png和dialog_right.9.png
   2.流程与ListView相似，但由setTag绑定viewHolder变为 => onCreateViewHolder() + onBindViewHolder(),并增加LayoutManager管理RecyclerView的具体布局
   3.活动布局更加复杂，msg_item通过线性布局排列发送框和接收框，activity_dialog将界面分为历史信息区域，和编辑新信息区域（包括编辑框和发送按钮）
   4.通过visible属性和msg对象的Type属性控制消息框样式，感觉viewgroup有点div的🦆
