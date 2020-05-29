package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {


    public static Date getDate(String str)throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = df.parse(str);
        return  date;

    }

    public static Date getTime(String str)throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date time = df.parse(str);
        return time;

    }




}
