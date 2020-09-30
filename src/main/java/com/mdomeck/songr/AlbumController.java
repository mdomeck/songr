package com.mdomeck.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AlbumController {

    @Autowired
    public AlbumRepository albumRepository;

    @PostMapping("/album")
    public RedirectView addAlbum(String title, String artist, int songCount, int length, String ImageUrl) {
        Album newAlbum = new Album(
                title,
                artist,
                songCount,
                length,
                ImageUrl
        );

        albumRepository.save(newAlbum);
        return new RedirectView("/album");
    }

    @GetMapping("/album")
    public String newAlbum(Model display) {
        ArrayList<Album> album = (ArrayList<Album>) albumRepository.findAll();

//        album.add(new Album("Breathless", "Kenny G", 16, 4140, "https://images-na.ssl-images-amazon.com/images/I/810ETs21iDL._SL1200_.jpg"
//        ));
//        album.add(new Album("Duel of the Fates","John Williams",1,254, "https://upload.wikimedia.org/wikipedia/en/c/cc/John_Williams_%E2%80%93_Duel_Of_The_Fates_%28Promotional_Single_Artwork%29.jpg"
//        ));
//        album.add(new Album("Welcome to the New", "Mercy Me", 10,2251,"https://images-na.ssl-images-amazon.com/images/I/71c1wtCTcsL._SL1500_.jpg"));

        display.addAttribute("display", album);
        return "album";
    }

    }
