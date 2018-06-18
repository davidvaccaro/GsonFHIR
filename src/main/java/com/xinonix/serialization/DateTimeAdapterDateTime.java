package com.xinonix.serialization;

import com.xinonix.Constants;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class DateTimeAdapterDateTime extends DateTypeAdapter {
    private DateTimeAdapterDateTime() {
    }

    @Override
    protected List<DateFormat> getDateFormats() {
        List<DateFormat> res = new ArrayList<DateFormat>();
        res.add(Constants.FORMATTER_YEAR);
        res.add(Constants.FORMATTER_YEAR_MONTH);
        res.add(Constants.FORMATTER_YEAR_MONTH_DAY);
        res.add(Constants.FORMATTER_DATE_TIME);
        res.add(Constants.FORMATTER_DATE_TIME_MILLISECONDS);
        res.add(Constants.FORMATTER_DATE_TIME_MILLISECONDS_TIMEZONE);
        return res;
    }
}
