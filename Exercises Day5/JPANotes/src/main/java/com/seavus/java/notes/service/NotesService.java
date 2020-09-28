package com.seavus.java.notes.service;

import com.seavus.java.notes.model.Notes;
import com.seavus.java.notes.model.User;
import com.seavus.java.notes.repository.NotesRepository;
import com.seavus.java.notes.repository.TagRepository;
import com.seavus.java.notes.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class NotesService {
    private NotesRepository notesRepository;
    private SecurityService securityService;
    private TagRepository tagRepository;


    @Autowired
    public NotesService(NotesRepository notesRepository, SecurityService securityService, TagRepository tagRepository) {
        this.notesRepository = notesRepository;
        this.securityService = securityService;
        this.tagRepository = tagRepository;
    }

    public Notes createNote(String title, String content) {
        User user = securityService.getAuthenticatedUser();
        Notes note = new Notes(title, content, user);
        return notesRepository.save(note);

    }


    public Notes updateNote(Notes notes, Long id) throws Exception {
        Notes note = notesRepository.findById(id).orElseThrow(() -> new Exception());
        note.setContent(notes.getContent());
        note.setTitle(notes.getTitle());
        return notesRepository.save(note);
    }

    public Optional<Notes> findNote(Long id) {
        return notesRepository.findById(id);
    }

    public List<Notes> findNotes(User user) {

        return notesRepository.findByUser(user);
    }


    public void deleteById(Long id) {
        notesRepository.deleteById(id);

    }


    public List<Notes> findNotesByTagId(Long id) {
        return notesRepository.findNotesByTagsId(id);
    }

}
