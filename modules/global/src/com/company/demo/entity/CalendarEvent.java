package com.company.demo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|caption")
@Table(name = "DEMO_CALENDAR_EVENT")
@Entity(name = "demo$CalendarEvent")
public class CalendarEvent extends StandardEntity {
    private static final long serialVersionUID = 5316127570328129918L;

    @Column(name = "CAPTION")
    protected String caption;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_DATE")
    protected Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_DATE")
    protected Date endDate;

    @Column(name = "STYLENAME")
    protected String stylename;

    public void setStylename(String stylename) {
        this.stylename = stylename;
    }

    public String getStylename() {
        return stylename;
    }


    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}