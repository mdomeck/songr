package com.mdomeck.songr;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AlbumTest {

@Test
public void albumConstructorTest() {
    Album album = new Album("Breathless", "Kenny G", 16, 4140, "https://images-na.ssl-images-amazon.com/images/I/810ETs21iDL._SL1200_.jpg");
    assertEquals("Breathless", album.title);
    assertEquals("Kenny G", album.artist);
    assertEquals(16, album.songCount);
    assertEquals(4140, album.length);
    assertEquals("https://images-na.ssl-images-amazon.com/images/I/810ETs21iDL._SL1200_.jpg", album.imageUrl);

    }

    @Test public void GetSetTitleTest(){
    Album album = new Album();
    album.setTitle("Kenny G");
    assertEquals("Kenny G", album.getTitle());
    }

    @Test public void GetSetArtistTest(){
        Album album = new Album();
        album.setArtist("3");
        assertEquals("3", album.getArtist());
    }

    @Test public void GetSetSongCountTest(){
        Album album = new Album();
        album.setSongCount(8);
        assertEquals(8, album.getSongCount());
    }

    @Test public void GetSetLengthTest(){
        Album album = new Album();
        album.setLength(3);
        assertEquals(3, album.getLength());
    }

    @Test public void GetSetImageTest(){
        Album album = new Album();
        album.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/810ETs21iDL._SL1200_.jpg");
        assertEquals("https://images-na.ssl-images-amazon.com/images/I/810ETs21iDL._SL1200_.jpg", album.getImageUrl());
    }


}
