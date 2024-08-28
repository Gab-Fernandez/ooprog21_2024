public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        SleepIn sleepIn = new SleepIn();

        System.out.println(sleepIn.sleepIn(false, false));
        System.out.println(sleepIn.sleepIn(true, false));  
        System.out.println(sleepIn.sleepIn(false, true)); 
    }
}
