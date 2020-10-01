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
    public RedirectView addSong(String title, long albumId){
        Album thisOne = albumRepository.getOne(albumId);
        Song thisSong = new Song(title, 10, 4, thisOne);
        songRepository.save(thisSong);

        return new RedirectView("/album");
    }
}
