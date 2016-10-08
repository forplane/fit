package com.jpadapter.adapter;


/**
 * Created by planes on 2016/9/3.<br/>
 * 暂时不提供此类
 */
@Deprecated
public class SelAdaOpetion
//        <T> implements SelectAdapterListener
{
//    public static final int SELECT_TYPE_NORMAL = 0;
//    public static final int SELECT_TYPE_MANY = SELECT_TYPE_NORMAL + 1;
//    private SuperAdapter<T> adapter;
//    private Context mContext;
//    private boolean isEdit = false;
//    private List<Boolean> saveStatus = new ArrayList<>();
//    private List<T> list;
//
//    public SelAdaOpetion(List<T> list, Context mContext, int selectType) {
//        //后期会修改
//        switch (selectType) {
//            case SELECT_TYPE_MANY:
//                adapter = new ManyAdapter<>(list, mContext);
//                break;
//            case SELECT_TYPE_NORMAL:
//                adapter = new NormalAdapter<>(list, mContext);
//                break;
//        }
//        adapter.setSelectAdapterListener(this);
//        for (int i = 0; i < list.size(); i++) {
//            saveStatus.add(false);
//        }
//        this.mContext = mContext;
//        this.list = list;
//    }
//
//    public SuperAdapter<T> getAdapter() {
//        return adapter;
//    }
//
//
//    @Override
//    public View initSelectView(View convertView, int pos) {
//        View cellView;
//        ViewGroup item_right_layout = (ViewGroup) convertView.findViewById(R.id.item_right_layout);
//        if (item_right_layout == null) {
//            //证明还没有加进去
//            cellView = LayoutInflater.from(mContext).inflate(R.layout.item_select_layout, null);
//            item_right_layout = (ViewGroup) cellView.findViewById(R.id.item_right_layout);
//            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, -2);
//            item_right_layout.addView(convertView, lp);
//        } else {
//            cellView = convertView;
//        }
//        int visible = isEdit ? View.VISIBLE : View.GONE;
//        cellView.findViewById(R.id.item_left_layout).setVisibility(visible);
//        Boolean aBoolean = saveStatus.get(pos);
//        cellView.findViewById(R.id.item_select_img).setSelected(aBoolean);
//        cellView.setOnClickListener(new SelectOnClick(pos));
//        return cellView;
//    }
//
//    private class SelectOnClick implements View.OnClickListener {
//
//        private int pos;
//
//        SelectOnClick(int pos) {
//            this.pos = pos;
//        }
//
//        @Override
//        public void onClick(View view) {
//            if (!isEdit) return;
//            saveStatus.set(pos, !saveStatus.get(pos));
//            adapter.notifyDataSetChanged();//这里会改成局部刷新
//
//            boolean isSelAll = true;
//            for (int i = 0; i < saveStatus.size(); i++) {
//                Boolean aBoolean = saveStatus.get(i);
//                if (!aBoolean) {
//                    isSelAll = false;
//                    break;
//                }
//            }
//            if (selectListener != null) {
//                selectListener.sendSelAll(isSelAll);
//            }
//        }
//    }
//
//
//    public boolean isEdit() {
//        return isEdit;
//    }
//
//    public void setEdit(boolean edit) {
//        for (int i = 0; i < saveStatus.size(); i++) {
//            saveStatus.set(i, false);
//        }
//        isEdit = edit;
//    }
//
//    public void notifyDataSetChanged() {
//        adapter.notifyDataSetChanged();
//    }
//
//    /**
//     * 是否全部选择
//     */
//    public void setAllSelect(boolean all) {
//        for (int i = 0; i < saveStatus.size(); i++) {
//            saveStatus.set(i, all);
//        }
//        notifyDataSetChanged();
//    }
//
//    /**
//     * 获取选择的List
//     */
//    public List<T> getSelectList() {
//        List<T> ll = new ArrayList<>();
//        for (int i = 0; i < saveStatus.size(); i++) {
//            if (saveStatus.get(i)) {
//                ll.add(list.get(i));
//            }
//        }
//        return ll;
//    }
//
//    private SelectListener selectListener;
//
//    public void setSelectListener(SelectListener selectListener) {
//        this.selectListener = selectListener;
//    }
//
//    /**
//     *  需要显示全选的监听
//     */
//    public interface SelectListener {
//        void sendSelAll(boolean all);
//    }
}
