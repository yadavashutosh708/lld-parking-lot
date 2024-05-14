package utils;

public class OutPrinter {
    private static volatile  OutPrinter instance = null;

    public OutPrinter getInstance(){
        synchronized (this){
            if(instance != null){
                return instance;
            }

            return new OutPrinter();
        }
    }

    private OutPrinter(){}

    public void welcome(){
        System.out.println("Welcome to World Parking Facility, we can park the galaxy XP");
    }
}