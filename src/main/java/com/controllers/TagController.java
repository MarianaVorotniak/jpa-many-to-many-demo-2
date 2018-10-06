package com.controllers;

import com.model.Tag;
import com.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {
    @Autowired
    TagRepository tagRepository;

    @RequestMapping("/all")
    public List<Tag> getall(){
        return tagRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Tag getOne(@PathVariable(value = "id") String id){
        return tagRepository.getOne(Integer.valueOf(id));
    }

    @RequestMapping("/post{id}")
    public List<Tag> getBookPublisher(@PathVariable("id") String id){
        return tagRepository.findByPostsId(Integer.valueOf(id));
    }
}
