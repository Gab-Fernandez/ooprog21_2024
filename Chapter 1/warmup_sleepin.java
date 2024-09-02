public class warmup_sleepin {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        warmup_sleepin sleepIn = new warmup_sleepin();

        System.out.println(sleepIn.sleepIn(false, false));
        System.out.println(sleepIn.sleepIn(true, false));  
        System.out.println(sleepIn.sleepIn(false, true)); 
    }
}
