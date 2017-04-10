package com.company.demo.web.toolkit.ui.client.calendar;

import com.vaadin.client.ui.calendar.CalendarConnector;
import com.vaadin.shared.ui.Connect;
import com.vaadin.ui.Calendar;

@Connect(value = Calendar.class, loadStyle = Connect.LoadStyle.LAZY)
public class CustomCalendarConnector extends CalendarConnector {

    @Override
    public CustomCalendarWidget getWidget() {
        return (CustomCalendarWidget) super.getWidget();
    }
}
