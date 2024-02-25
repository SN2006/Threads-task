package app.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class FruitsThread extends Thread{

    private final VegetablesThread vegetablesThread;

    private final String[] fruitsContainer = new String[]{
            "apple", "orange", "banana", "pear"
    };

    public FruitsThread(VegetablesThread vegetablesThread) {
        this.vegetablesThread = vegetablesThread;
    }

    @Override
    public void run() {
        try {
            vegetablesThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        printFruits();
    }

    private void printFruits(){
        System.out.println("Fruits: ");
        AtomicInteger counter = new AtomicInteger(0);
        for (String fruit : fruitsContainer){
            System.out.println(counter.incrementAndGet() + ") " + fruit);
        }
    }
}
