package com.mdomeck.songr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {

//    @Query("SELECT * FROM song WHERE song.album_id = ?1")
//    List<Song> findByAlbumId(long id);

}
