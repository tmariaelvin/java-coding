package main.simple;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class dateformate {
    public static void main(String[] args)throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
        String str=sdf.format(new Date());
        System.out.println("    "+str);

        //sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date date=sdf.parse(str);
        System.out.println(" "+date);

    }
}
