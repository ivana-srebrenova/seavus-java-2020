package com.seavus.java.notes.repository;

import com.seavus.java.notes.model.Notes;
import com.seavus.java.notes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface NotesRepository extends JpaRepository<Notes, Long> {


    List<Notes> findNotesByTagsId(Long id);

    List<Notes> findByUser(User user);


}






