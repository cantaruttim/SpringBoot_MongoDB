package com.cantaruttimatheus.SpringBoot.resource;

import com.cantaruttimatheus.SpringBoot.domain.Post;
import com.cantaruttimatheus.SpringBoot.domain.User;
import com.cantaruttimatheus.SpringBoot.dto.UserDTO;
import com.cantaruttimatheus.SpringBoot.resource.util.URL;
import com.cantaruttimatheus.SpringBoot.service.PostService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Post>  findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value="/titlesearch", method=RequestMethod.GET)
    public ResponseEntity<List<Post>>  findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {

        text = URL.decodeParam(text);
        List<Post> list = service.finByTitle(text);
        return ResponseEntity.ok().body(list);
    }

}
