package com.feicuiedu.refreshdemo;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：yuanchao on 2016/8/24 0024 16:29
 * 邮箱：yuanchao@feicuiedu.com
 */
public class RefreshPresenter {
    private RefreshView refreshView;
    private List<String> list;

    public RefreshPresenter(RefreshView refreshView) {

        this.refreshView = refreshView;
        list = new ArrayList<>();
    }

    public void refresh(){
        //显示刷新
        new Refresh().execute();
    }

    class Refresh extends AsyncTask<Void,Void,Void> {

        @Override protected Void doInBackground(Void... params) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            for (int i = 0; i < 20; i++) {
                list.add("刷新出来的数据"+i);
            }
            refreshView.setData(list);
            //隐藏刷新
            refreshView.hideRefresh();
        }
    }
}
