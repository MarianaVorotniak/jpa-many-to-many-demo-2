package com.controllers;

import com.model.Post;
import com.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostRepository postRepository;

    @RequestMapping("/all")
    public List<Post> getall(){
        return postRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Post getOne(@PathVariable(value = "id") String id){
        return postRepository.getOne(Integer.valueOf(id));
    }

    @RequestMapping("/tag{id}")
    public List<Post> getBookPublisher(@PathVariable("id") String id){
        return postRepository.findByTagsId(Integer.valueOf(id));
    }
}
