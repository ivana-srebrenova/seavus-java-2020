package com.seavus.java.notes.repository;

import com.seavus.java.notes.model.Tag;
import com.seavus.java.notes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag, Long> {


    List<Tag> findByUser(User user);


}
