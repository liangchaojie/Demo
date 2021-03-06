package com.canadapter.mulitem;

import com.canadapter.R;
import com.zhy.adapter.recyclerview.base.ItemViewDelegate;
import com.zhy.adapter.recyclerview.base.ViewHolder;

/**
 * Created by Administrator on 2017/6/27.
 */

public class Right implements ItemViewDelegate<String> {
    @Override
    public int getItemViewLayoutId() {
        return R.layout.item_right;
    }

    @Override
    public boolean isForViewType(String item, int position) {
        return position%2!=0;
    }

    @Override
    public void convert(ViewHolder holder, String s, int position) {
        holder.setText(R.id.tv, s);
    }
}
