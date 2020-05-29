package requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import utilities.CustomDateSerializer;


import java.util.Date;


public class Trains extends Base {


    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonProperty("date")
    private Date date;


    @JsonProperty("from_code")
    private int fromCode;

    @JsonFormat(pattern = "HH:mm")
    @JsonProperty("time_from")
    private Date timeFrom;

    @JsonFormat(pattern = "HH:mm")
    @JsonProperty("time_to")
    private Date timeTo;


    @JsonProperty("to_code")
    private int toCode;

    /**
     * No args constructor for use in serialization
     *
     */
    public Trains() {
    }

    /**
     *
     * @param toCode
     * @param timeTo
     * @param timeFrom
     * @param date
     * @param fromCode
     */
    public Trains(Date date, int fromCode, Date timeFrom, Date timeTo, int toCode) {
        super();
        this.date = date;
        this.fromCode = fromCode;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
        this.toCode = toCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getFromCode() {
        return fromCode;
    }

    public void setFromCode(int fromCode) {
        this.fromCode = fromCode;
    }

    public Date getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(Date timeFrom) {
        this.timeFrom = timeFrom;
    }

    public Date getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(Date timeTo) {
        this.timeTo = timeTo;
    }

    public int getToCode() {
        return toCode;
    }

    public void setToCode(int toCode) {
        this.toCode = toCode;
    }

}