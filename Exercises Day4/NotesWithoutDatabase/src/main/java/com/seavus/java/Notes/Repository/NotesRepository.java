package com.seavus.java.Notes.Repository;

import com.seavus.java.Notes.Model.Notes;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class NotesRepository {
    private long nextId = 101;

    private ArrayList<Notes> notes = new ArrayList<>();

    public void save(Notes note) {
        note.setId(nextId++);
        notes.add(note);
    }

    public Optional<Notes> findbyId(Long id) {
        return notes.stream().filter(note -> note.getId().equals(id)).findFirst();
    }

    public List<Notes> findAll() {
        return notes;
    }

    public void deleteNotes(Long id) {
        notes.removeIf(n -> n.getId().equals(id));
    }

}






