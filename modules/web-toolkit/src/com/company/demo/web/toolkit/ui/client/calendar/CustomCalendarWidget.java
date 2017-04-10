package com.company.demo.web.toolkit.ui.client.calendar;

import com.company.demo.web.toolkit.ui.client.calendar.schedule.CustomWeekGrid;
import com.vaadin.client.ui.VCalendar;

public class CustomCalendarWidget extends VCalendar {
    @Override
    protected void createWeekGrid() {
        if (weekGrid == null) {
            weekGrid = new CustomWeekGrid(this, is24HFormat());
        }
    }
}
