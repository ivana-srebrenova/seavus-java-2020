package com.seavus.java.notes.service;

import com.seavus.java.notes.model.Note;
import com.seavus.java.notes.model.Tag;
import com.seavus.java.notes.model.User;
import com.seavus.java.notes.repository.NotesRepository;
import com.seavus.java.notes.repository.TagRepository;
import com.seavus.java.notes.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class NoteService {
    private NotesRepository notesRepository;
    private SecurityService securityService;
    private TagRepository tagRepository;


    @Autowired
    public NoteService(NotesRepository notesRepository, SecurityService securityService, TagRepository tagRepository) {
        this.notesRepository = notesRepository;
        this.securityService = securityService;
        this.tagRepository = tagRepository;
    }

    public Note createNote(String title, String content,List<Long> tagIds) {
        User user = securityService.getAuthenticatedUser();
        List<Tag> tags = tagRepository.findAllById(tagIds).stream().filter(tag -> tag.getUser().equals(user)).collect(Collectors.toList());
        Note note = new Note(title, content, user,tags);
        return notesRepository.save(note);

    }


    public Note updateNote(Note notes, Long id) throws Exception {
        Note note = notesRepository.findById(id).orElseThrow(() -> new Exception());
        note.setContent(notes.getContent());
        note.setTitle(notes.getTitle());
        return notesRepository.save(note);
    }

    public Optional<Note> findNote(Long id) {
        return notesRepository.findById(id);
    }

    public List<Note> findNotes(User user) {

        return notesRepository.findByUser(user);
    }


    public void deleteById(Long id) {
        notesRepository.deleteById(id);

    }

    public void deleteTagFromNote(Tag tag) {

        notesRepository.findAll().forEach(note -> note.getTags().remove(tag));

    }


    public List<Note> findNotesByTagId(Long id) {
        return notesRepository.findNotesByTagsId(id);
    }

}
