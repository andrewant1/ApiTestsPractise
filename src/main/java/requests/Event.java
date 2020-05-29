package requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import utilities.CustomDateSerializer;

import java.util.Date;

public class Event {
    public String name;

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date eventDate;


    public Event(String name, Date eventDate) {
        this.name = name;
        this.eventDate = eventDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
}