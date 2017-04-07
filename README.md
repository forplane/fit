
**单种item的使用**
----------
1：注解Bean类 这个是数据源类
```Java
@NormalH(holderName = ItemH.class)
public class ItemBean {

}
```
2：Holder类item的复用类
```Java
public class ItemH extends INormalHolder<ItemBean>{
    public ItemH(Context ctx) {
        super(ctx);
        //在构造函数指明是那个布局
        layout=R.layout.test_left_layout;
    }
    public void initView(View view) {
        //重写此方法，主要是控件初始化
    }

    public void setData(ItemBean bean){
        //数据操作
    }
}
```

3：直接使用<br/>
BaseAdapter adapter = new NormalAdapter<>(list, this);

mListView.setAdapter(adapter);<br/>



**多种item的使用**
----------
1：注解Bean类<br/>
```Java
@ManyH(holders = {ItemsLeftH.class,ItemsRightH.class})
public class ItemsBean {
    @TypeH//注解类型字段
    private int type;//哪一种布局 0:ItemsLeftH 1:ItemsRightH
}
```
2：Holder类<br/>
```Java
public class ItemsLeftH extends IManyHolder<ItemsBean>{
    public ItemsLeftH(Context ctx) {
        super(ctx);
        //在构造函数指明是那个布局
        layout=R.layout.test_left_layout;
    }
    public void initView(View view) {
        //重写此方法，主要是控件初始化
    }
    
    public void setData(ItemBean bean){
        //数据操作
    }
}
public class ItemsRightH extends IManyHolder<ItemsBean>{
    public ItemsLeftH(Context ctx) {
        super(ctx);
        //在构造函数指明是那个布局
        layout=R.layout.test_left_layout;
    }
    public void initView(View view) {
        //重写此方法，主要是控件初始化
    }
    public void setData(ItemBean bean){
        //数据操作
    }
}
```
3：直接使用

BaseAdapter adapter = new ManyAdapter<>(list, this);

mListView.setAdapter(adapter);

以上就是简单使用说明

具体没有介绍的，可以直接导出项目看

=======
# fit
>>>>>>> a3d82f05d15b92405f0bb85366f61441189f7c2e
