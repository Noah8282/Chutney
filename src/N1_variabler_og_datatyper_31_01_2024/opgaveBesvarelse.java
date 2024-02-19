package N1_variabler_og_datatyper_31_01_2024;

public class opgaveBesvarelse {

    public static void main(String[] args) {
        //Definition af variabel: [datatype/Object] [navn] = [indhold/Object]
        //Primitive datatypes: char, int, double, float, long, boolean, short, byte.
        //Non-prmitive datatypes String, arrays, classes, objects.

        String str = "Test";
        int integer = 1;
        double db = 1.5;
        char character = 's';

        //Udskrivelse af dato
        String dayOfWeek = "Sunday";
        int dayOfMonth = 15;
        String monthName = "February";
        int monthInt = 2;
        int year = 2024;

        System.out.println("It is a "+dayOfWeek+". The date is the "+dayOfMonth+"th of "+monthName+" "+year+". Formatted: "+dayOfMonth+"/"+monthInt+"/"+year);

        //Timer, minut, sekunder, og tid siden midnat
        int hour = 14;
        int min = 5;
        int sec = 0;
        int hourInSec = hour*3600;
        int minInSec = min*60;

        int secSinceMidnight = hourInSec+minInSec+sec;
        int secTillMidnight = 24*3600-(secSinceMidnight);

        System.out.println("Klokken er: "+hour+":"+min+":"+sec);
        System.out.println("Der er gået "+secSinceMidnight+" sekunder siden midnat");
        System.out.println("Der er "+secTillMidnight+" sekunder til midnat");
    }
}
