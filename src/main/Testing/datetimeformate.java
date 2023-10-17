package main.Testing;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformate {
    public static void main(String[] args)

    {
LocalDateTime mydate=LocalDateTime.now();
System.out.println(mydate);
        DateTimeFormatter dayfirst=DateTimeFormatter.ofPattern("dd/MM/yyyy , hh-mm-ss");
        DateTimeFormatter monthfirst=DateTimeFormatter.ofPattern("MM/dd/yyyy , hh-mm-ss");
        DateTimeFormatter yearfirst=DateTimeFormatter.ofPattern("E, MMM dd yyy , hh-mm-ss");
        String formatedate=mydate.format(dayfirst);
        System.out.println(formatedate);
        String formatedate1=mydate.format(monthfirst);
        System.out.println(formatedate1);

        String formatedate2=mydate.format(yearfirst);
        System.out.println(formatedate2);


    }}
