package com.mdomeck.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class SongController {

    @Autowired AlbumRepository albumRepository;

    @Autowired SongRepository songRepository;

    @PostMapping("/song")
    public RedirectView addSong(String title, long songId){
        Album thisOne = albumRepository.getOne(songId);
        Song thisSong = new Song(title, 10, 4, thisOne);

        return new RedirectView("/album");
    }
}
