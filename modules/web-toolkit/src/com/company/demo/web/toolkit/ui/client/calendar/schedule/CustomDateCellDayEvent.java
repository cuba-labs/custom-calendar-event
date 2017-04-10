package com.company.demo.web.toolkit.ui.client.calendar.schedule;

import com.vaadin.client.ui.calendar.schedule.CalendarEvent;
import com.vaadin.client.ui.calendar.schedule.DateCell;
import com.vaadin.client.ui.calendar.schedule.DateCellDayEvent;
import com.vaadin.client.ui.calendar.schedule.WeekGrid;

public class CustomDateCellDayEvent extends DateCellDayEvent {

    public CustomDateCellDayEvent(DateCell dateCell, WeekGrid parent, CalendarEvent event) {
        super(dateCell, parent, event);

        addStyleName("v-calendar-custom-event");
    }

    @Override
    protected String getInnerHTML(boolean bigMode) {
        return "<span>" + calendarEvent.getTimeAsText() + "</span><br/>" + calendarEvent.getCaption()
                + "<div class=\"v-calendar-custom-event-description\"><span>"
                + calendarEvent.getDescription() + "</span></div>";
    }
}
