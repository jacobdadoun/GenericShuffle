package edu.touro.mco264;

import java.util.*;

public class GenericShuffle {

    public <T> void shuffle(T[] list){

        for(int i = 0; i < list.length; i++){

            int j = (new Random().nextInt(list.length));

            T item = list[i];
            list[i] = list[j];
            list[j] = item;
        }
    }

}
