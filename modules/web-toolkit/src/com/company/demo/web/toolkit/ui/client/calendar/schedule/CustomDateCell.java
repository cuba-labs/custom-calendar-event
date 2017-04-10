package com.company.demo.web.toolkit.ui.client.calendar.schedule;

import com.vaadin.client.ui.calendar.schedule.CalendarEvent;
import com.vaadin.client.ui.calendar.schedule.DateCell;
import com.vaadin.client.ui.calendar.schedule.DateCellDayEvent;
import com.vaadin.client.ui.calendar.schedule.WeekGrid;

import java.util.Date;

public class CustomDateCell extends DateCell {

    public CustomDateCell(WeekGrid parent, Date date) {
        super(parent, date);
    }

    @Override
    protected DateCellDayEvent createDateCellDayEvent(CalendarEvent calendarEvent) {
        return new CustomDateCellDayEvent(this, weekgrid, calendarEvent);
    }
}
