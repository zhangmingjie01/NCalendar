package com.necer.adapter;

import android.content.Context;
import android.view.View;

import com.necer.listener.OnClickWeekViewListener;
import com.necer.listener.OnRedrawCurrentViewListener;
import com.necer.utils.Attrs;
import com.necer.view.WeekView;

/**
 * Created by necer on 2018/9/11.
 * qq群：127278900
 */
public class WeekCalendarAdapter extends BaseCalendarAdapter {
    private OnClickWeekViewListener mOnClickWeekViewListener;
    public WeekCalendarAdapter(Context context, Attrs attrs, int count, int curr, OnRedrawCurrentViewListener onRedrawCurrentViewListener, OnClickWeekViewListener onClickWeekViewListener) {
        super(context, attrs, count, curr,onRedrawCurrentViewListener);
        this.mOnClickWeekViewListener = onClickWeekViewListener;
    }

    @Override
    protected View getView(int position) {
        WeekView weekView = new WeekView(mContext, mAttrs, mInitializeDate.plusDays((position - mCurr) * 7),mOnClickWeekViewListener);
        return weekView;
    }


}
