package requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import utilities.CustomDateSerializer;

import java.util.Date;

public class TrainsBuilder {


    private final  Date date;
    private final int fromCode;
    private final Date timeFrom;
    private final Date timeTo;
    private final  int toCode;


    public  static  class Builder{


        @JsonSerialize(using = CustomDateSerializer.class)
        @JsonProperty("date")
        private final  Date date;

        @JsonProperty("from_code")
        private final int fromCode;

        @JsonFormat(pattern = "HH:mm")
        @JsonProperty("time_from")
        private final Date timeFrom;


        @JsonProperty("to_code")
        private final  int toCode;


        @JsonFormat(pattern = "HH:mm")
        @JsonProperty("time_to")
        private final Date timeTo=null;


        public Builder( Date date, int fromCode, Date timeFrom, int toCode){

            this.date=date;
            this.fromCode=fromCode;
            this.timeFrom=timeFrom;
            this.toCode=toCode;

        }


        public Builder setTimeTo(Date val){
            val= timeTo;
            return this;
        }


        public TrainsBuilder build(){
            return new TrainsBuilder(this);
        }


    }



    private TrainsBuilder(Builder builder) {
        date = builder.date;
        fromCode = builder.fromCode;
        timeFrom  = builder.timeFrom;
        timeTo = builder.timeTo;
        toCode = builder.toCode;
    }



    public Date getDate() {
        return date;
    }

    public int getFromCode() {
        return fromCode;
    }

    public Date getTimeFrom() {
        return timeFrom;
    }

    public Date getTimeTo() {
        return timeTo;
    }

    public int getToCode() {
        return toCode;
    }




}
