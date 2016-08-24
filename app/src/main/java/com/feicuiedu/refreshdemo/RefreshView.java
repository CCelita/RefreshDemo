package com.feicuiedu.refreshdemo;

import java.util.List;

/**
 * 作者：yuanchao on 2016/8/24 0024 17:19
 * 邮箱：yuanchao@feicuiedu.com
 */
public interface RefreshView {

    void setData(List<String> list);

    void showRefresh();

    void hideRefresh();
}
