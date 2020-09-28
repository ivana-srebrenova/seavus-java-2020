package com.seavus.java.notes.service;

import com.seavus.java.notes.model.Notes;
import com.seavus.java.notes.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


@Service
public class NotesService {
    private NotesRepository notesRepository;

    @Autowired
    public NotesService(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    public void createNote(String title, String content) {

        Notes notes = new Notes(title, content);
        notesRepository.save(notes);

    }

    public void updateNote(Notes notes, Long id) throws Exception {
        Notes note=notesRepository.findById(id).orElseThrow(()->new Exception());
        note.setContent(notes.getContent());
        note.setTitle(notes.getTitle());
    }

    public Optional<Notes> findNote(Long id) {
        return notesRepository.findById(id);
    }

    public List<Notes> findNotes() {
        return notesRepository.findAll();

    }

    public void deleteById(Long id) {
        notesRepository.deleteById(id);
    }


}
