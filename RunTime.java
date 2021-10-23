package classwork.Day1;



public class RunTime {
    public static void main(String[] args) {
        System.out.println("Today's Specials: " + getSpecials());
    }

    public static String getSpecials() {
        return SpecialToday.getDesert();
    }
}
