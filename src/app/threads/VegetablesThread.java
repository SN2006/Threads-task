package app.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class VegetablesThread extends Thread{

    private final String[] vegetablesContainer = new String[]{
            "tomato", "potato", "cucumber", "onion"
    };

    @Override
    public void run() {
        printVegetables();
    }

    private void printVegetables(){
        System.out.println("Vegetables: ");
        AtomicInteger counter = new AtomicInteger(0);
        for (String vegetable : vegetablesContainer){
            System.out.println(counter.incrementAndGet() + ") " + vegetable);
        }
    }
}
