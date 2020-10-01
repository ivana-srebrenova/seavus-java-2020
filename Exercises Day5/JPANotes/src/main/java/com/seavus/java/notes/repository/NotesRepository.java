package com.seavus.java.notes.repository;

import com.seavus.java.notes.model.Note;
import com.seavus.java.notes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface NotesRepository extends JpaRepository<Note, Long> {


    List<Note> findNotesByTagsId(Long id);

    List<Note> findByUser(User user);


}






