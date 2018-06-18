package com.xinonix.serialization;

import com.xinonix.Constants;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class DateTypeAdapterDate extends DateTypeAdapter {
    private DateTypeAdapterDate() {
    }

    @Override
    protected List<DateFormat> getDateFormats() {
        List<DateFormat> res = new ArrayList<DateFormat>();
        res.add(Constants.FORMATTER_YEAR);
        res.add(Constants.FORMATTER_YEAR_MONTH);
        res.add(Constants.FORMATTER_YEAR_MONTH_DAY);
        return res;
    }
}
