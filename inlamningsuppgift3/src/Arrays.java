/**
 * datalogiUppgift3slutuppgift
 *
 * @author Lars Strömberg, Madeleine Hallqvist, Mattias Ahlström
 * @version 1.0
 * @since 2019-02-18
 * https://github.com/deskavaenkelt/datalogiUppgift3slutuppgift
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class Arrays {

    private static ArrayList<String> strings = new ArrayList<>();
    private static ArrayList<Integer> fibonacci = new ArrayList<>();
    private static ArrayList<Date> timeStamp = new ArrayList<>();
    private static ArrayList<Integer> evenNumbers = new ArrayList<>();
    private static ArrayList<Integer> oddNumbers = new ArrayList<>();

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    //----- Getters -----//
    public static ArrayList<String> getStrings() {
        return strings;
    }
    public static ArrayList<Integer> getFibonacci() {
        return fibonacci;
    }
    public static ArrayList<Date> getTimeStamp() { return timeStamp; }
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
    public static void setStrings(String string) {
        strings.add(string);
    }
    public static void setFibonacci(int number) {
        fibonacci.add(number);
    }
    public static void setTimeStamp(Date date) {
        timeStamp.add(date);
    }
    public static void setEvenNumbers(int evenNumber) {
        evenNumbers.add(evenNumber);
    }
    public static void setOddNumbers(int oddNumber) {
        oddNumbers.add(oddNumber);
    }
    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }
}