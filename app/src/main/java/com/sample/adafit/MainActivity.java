package com.sample.adafit;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.BaseAdapter;
import android.widget.ListView;


import com.jpadapter.adapter.ManyAdapter;
import com.jpadapter.adapter.NormalAdapter;
import com.jpadapter.i.IHolderAccept;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements IHolderAccept {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.text_listview);
//        testItem();
    }



    private void testItem() {
        List<ItemBean> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            ItemBean bean = new ItemBean();
            bean.setTxt("txt=" + i);
            list.add(bean);
        }
        BaseAdapter adapter = new NormalAdapter<>(list, this);
        mListView.setAdapter(adapter);
    }

    @Override
    public void acceptMessage(Object obj) {
        Log.i("", "");
    }
}
