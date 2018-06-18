package com.xinonix.serialization;

import com.xinonix.Constants;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public final class DateTypeAdapterTime extends DateTypeAdapter {
    private DateTypeAdapterTime() {
    }

    @Override
    protected List<DateFormat> getDateFormats() {
        List<DateFormat> res = new ArrayList<DateFormat>();
        res.add(Constants.FORMATTER_TIME);
        return res;
    }
}
