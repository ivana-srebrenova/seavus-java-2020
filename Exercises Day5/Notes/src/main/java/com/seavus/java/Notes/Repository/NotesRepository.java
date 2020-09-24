package com.seavus.java.Notes.Repository;

import com.seavus.java.Notes.Model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface NotesRepository extends JpaRepository<Notes,Long> {


}






