package com.repositories;

import com.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag, Integer> {

    public List<Tag> findByPostsId(int id);
}