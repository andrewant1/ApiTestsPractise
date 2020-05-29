package tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import requests.Event;
import requests.Trains;
import utilities.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TrainsTests {

@Test
public void  postTrainsTest() throws JsonProcessingException, ParseException {
    Trains trains = new Trains();

    trains.setDate(DateUtil.getDate("03-02-2019"));
    trains.setFromCode(2200001);
    trains.setToCode(2218000);
    trains.setTimeTo(DateUtil.getTime("09:00"));
    trains.setTimeFrom(DateUtil.getTime("12:00"));




    ObjectMapper mapper = new ObjectMapper();



    System.out.println(mapper.writeValueAsString(trains));
   }

@Test

public void whenUsingJsonFormatAnnotationToFormatDate_thenCorrect()
        throws JsonProcessingException, ParseException {




    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");


    String toParse = "20-12-2014";

    Date date = df.parse(toParse);

    Event event = new Event("party", date);

    ObjectMapper mapper = new ObjectMapper();
    String result = mapper.writeValueAsString(event);
    System.out.println(result);

}


    @Test( dataProvider = "MySQL-provider")
    // @Test
    public void testTest(String a, String b) {

        System.out.println("The values in the database are: " + a + " " + b );

    }

}
