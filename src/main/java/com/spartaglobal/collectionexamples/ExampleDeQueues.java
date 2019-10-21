package com.spartaglobal.collectionexamples;

import java.util.Deque;
import java.util.LinkedList;

public class ExampleDeQueues {
    private Deque<String> carPark = new LinkedList<>();

    public ExampleDeQueues() {
        carPark.add("Car1");
        carPark.add("Car2");
        carPark.add("Car3");
    }

    public void workingWithOurDequeue(){
       // for (String car:carPark) {
       //     System.out.println(car);
     //   }
        System.out.println(carPark.getFirst());
    }
}
