package com.repositories;

import com.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

    public List<Post> findByTagsId(int id);
}
