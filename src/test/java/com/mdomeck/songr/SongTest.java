package com.mdomeck.songr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {


    @Test public void GetSetTitleTest(){
        Song song = new Song();
        song.setTitle("Breathless");
        assertEquals("Breathless", song.getTitle());
    }

    @Test
    public void GetSetLengthTest(){
        Song song = new Song();
        song.setLength(3);
        assertEquals(3, song.getLength());
    }

    @Test
    public void GetSetTrackNumberTest(){
        Song song = new Song();
        song.setTrackNumber(3);
        assertEquals(3, song.getTrackNumber());
    }
    

}
