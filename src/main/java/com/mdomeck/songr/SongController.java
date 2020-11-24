package com.mdomeck.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import java.util.ArrayList;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/songlist/{id}")
    public String goToSongs(@PathVariable long id, Model newModel) { //this can take in multiple arguments
        Album thisAlbum = albumRepository.getOne(id);

        newModel.addAttribute("album", thisAlbum);

        return "songlist";
    }

    @PostMapping("/song")
    public RedirectView addSong(String title, long albumId, int track, int length) {
        Album thisOne = albumRepository.getOne(albumId);
        Song thisSong = new Song(title, 10, 4, thisOne);
        songRepository.save(thisSong);


        return new RedirectView("/album");
    }
}
