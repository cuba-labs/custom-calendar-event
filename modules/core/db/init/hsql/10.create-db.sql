-- begin DEMO_CALENDAR_EVENT
create table DEMO_CALENDAR_EVENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CAPTION varchar(255),
    DESCRIPTION varchar(255),
    START_DATE timestamp,
    END_DATE timestamp,
    STYLENAME varchar(255),
    --
    primary key (ID)
)^
-- end DEMO_CALENDAR_EVENT
