import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        if ((year<=2000)||(year>=3000))
            return null;
        Calendar unCalendari = Calendar.getInstance();
        unCalendari.set(year,month-1,day,0,0);
        int dia = unCalendari.get(Calendar.DAY_OF_WEEK);
        DateFormatSymbols simbols = new DateFormatSymbols();
        return((""+simbols.getWeekdays()[dia]).toUpperCase());
    }
