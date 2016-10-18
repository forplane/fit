使用说明
单个Item（以下称为Holder类）使用说明
1：注解Bean类
@NormalH(holderName = ItemH.class)
public class ItemBean {}

2：Holder类
public class ItemH extends INormalHolder<ItemBean>{

    在构造函数指明是那个布局
    layout=R.layout.test_left_layout;

    public void initView(View view) {
        //重写此方法，主要是控件初始化
    }

    public void setData(ItemBean bean){
        //数据操作
    }
}

3：直接使用
BaseAdapter adapter = new NormalAdapter<>(list, this);
mListView.setAdapter(adapter);

多种Holder使用
1：注解Bean类
@ManyH(holders = {ItemsLeftH.class,ItemsRightH.class})
public class ItemsBean {
    @TypeH//注解类型字段
    private int type;//哪一种布局 0:ItemsLeftH 1:ItemsRightH
}

2：Holder类
public class ItemsLeftH extends IManyHolder<ItemsBean>{
    这里的相关说明同上
    layout以及两个重写方法
}
public class ItemsRightH extends IManyHolder<ItemsBean>{
    同上
}
3：直接使用
BaseAdapter adapter = new ManyAdapter<>(list, this);
mListView.setAdapter(adapter);

以上就是简单使用说明
具体没有介绍的，可以直接导出项目看
------------------------------不知道为什么，就是想弄上一条分界线---------------------------

