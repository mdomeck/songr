package com.mdomeck.songr;


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

}
