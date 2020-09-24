package com.seavus.java.Notes.Service;

import com.seavus.java.Notes.Model.Notes;
import com.seavus.java.Notes.Repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class NotesService {
    private NotesRepository notesRepository;

    @Autowired
    public NotesService(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    public void createNotes(String title, String content) {

        Notes notes = new Notes(title, content);
        notesRepository.save(notes);

    }

    public void updateNotes(Notes notes, Long id) {
        List<Notes> note = notesRepository.findAll();
        for (Notes n : note)
            if (n.getId().equals(id)) {
                n.setContent(notes.getContent());
                n.setTitle(notes.getTitle());
            }
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
