package edu.touro.mco264;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GenericShuffleTest {

    //Arrange
    private GenericShuffle genShuffle = new GenericShuffle();

    @Test
    void shuffle(){
        // Arrange
        Integer[] temp = new Integer[10];

        for(int i = 0; i < 10; i++){
            temp[i] = i + 1;
        }

        // Act
        Integer[] shuffledTemp = temp.clone();
        genShuffle.shuffle(shuffledTemp);

        // Assert
        assertNotEquals(temp, shuffledTemp);
    }

}
