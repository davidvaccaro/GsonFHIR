package com.xinonix.serialization;

import com.google.gson.TypeAdapter;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.util.List;

public abstract class DateTypeAdapter extends TypeAdapter<Date> {
    protected abstract List<DateFormat> getDateFormats();

    @Override
    @SuppressWarnings("resource")
    public final void write(final JsonWriter out, final Date value)
        throws IOException {
        out.value(getDateFormats().get(0).format(value));
    }

    @Override
    public final Date read(final JsonReader in) {
        try {

            // Establish the next string (date)
            String next = in.nextString();

            // Loop over the formats for the first that works
            for (DateFormat format : getDateFormats()) {
                try {

                    // Parse the next date
                    Date val = format.parse(next);

                    // If the value was successfully parsed, return
                    return val;

                } catch (Exception e) {
                }
            }

        }
        catch (Exception e)
        {
        }

        return null;
    }
}
