import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class Arrays {


    private static ArrayList<String> strings = new ArrayList<>();
    private static ArrayList<Integer> fibonacci = new ArrayList<>();
    private static ArrayList<Date> timeStamp = new ArrayList<>();
    private static ArrayList<Integer> evenNumbers = new ArrayList<>();
    private static ArrayList<Integer> oddNumbers = new ArrayList<>();



    //https://www.quora.com/How-do-I-sort-an-ArrayList-of-dates-based-on-the-current-date-in-Java
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");



    //----- Getters -----//
    public static ArrayList<String> getStrings() {
        return strings;
    }

    public static ArrayList<Integer> getFibonacci() {
        return fibonacci;
    }

    public static ArrayList<Date> getTimeStamp() {
        return timeStamp;
    }

    public static ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public static ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }


    //----- Setters -----//
    public static void setStrings(ArrayList<String> strings) {
        Arrays.strings = strings;
    }

    public static void setFibonacci(ArrayList<Integer> fibonacci) {
        Arrays.fibonacci = fibonacci;
    }

    public static void setTimeStamp(ArrayList<Date> timeStamp) {
        Arrays.timeStamp = timeStamp;
    }

    public static void setEvenNumbers(ArrayList<Integer> evenNumbers) {
        Arrays.evenNumbers = evenNumbers;
    }

    public static void setOddNumbers(ArrayList<Integer> oddNumbers) {
        Arrays.oddNumbers = oddNumbers;
    }

    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }
}