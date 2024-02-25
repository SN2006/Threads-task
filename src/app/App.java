package app;

import app.threads.FruitsThread;
import app.threads.VegetablesThread;

public class App {

    public static void main(String[] args){
        VegetablesThread vegetablesThread = new VegetablesThread();
        FruitsThread fruitsThread = new FruitsThread(vegetablesThread);

        fruitsThread.start();
        vegetablesThread.start();
    }

}
