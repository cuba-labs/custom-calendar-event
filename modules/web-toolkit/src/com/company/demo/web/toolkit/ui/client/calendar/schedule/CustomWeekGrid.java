package com.company.demo.web.toolkit.ui.client.calendar.schedule;

import com.vaadin.client.ui.VCalendar;
import com.vaadin.client.ui.calendar.schedule.DateCell;
import com.vaadin.client.ui.calendar.schedule.WeekGrid;

import java.util.Date;

public class CustomWeekGrid extends WeekGrid {

    public CustomWeekGrid(VCalendar parent, boolean format24h) {
        super(parent, format24h);
    }

    @Override
    public void addDate(Date d) {
        final DateCell dc = new CustomDateCell(this, d);
        dc.setDisabled(isDisabled());
        dc.setHorizontalSized(isHorizontalScrollable() || width < 0);
        dc.setVerticalSized(isVerticalScrollable());
        content.add(dc);
    }
}
