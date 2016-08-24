package com.feicuiedu.refreshdemo;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：yuanchao on 2016/8/24 0024 16:29
 * 邮箱：yuanchao@feicuiedu.com
 */
public class RefreshPresenter {
    MainActivity activity;
    private List<String> list;

    public RefreshPresenter(MainActivity activity) {

        this.activity = activity;
        list = new ArrayList<>();
    }

    public void refresh(){
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
            activity.setData(list);
        }
    }
}
