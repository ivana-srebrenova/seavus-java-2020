package com.seavus.java.notes.api;

import com.seavus.java.notes.model.Note;
import com.seavus.java.notes.model.User;
import com.seavus.java.notes.service.NoteService;
import com.seavus.java.notes.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
public class NoteController {

    private NoteService noteService;
    private SecurityService securityService;

    @Autowired
    public NoteController(NoteService noteService, SecurityService securityService) {
        this.noteService = noteService;
        this.securityService = securityService;
    }

    @PostMapping("/api/notes")
    public Note createNote(@RequestBody CreateNotesRequest request) {
        return noteService.createNote(request.title, request.content);
    }

    public static class CreateNotesRequest {
        public String title;
        public String content;
    }


    @GetMapping("/api/notes/{id}")
    public Note findNote(@PathVariable Long id) {
        return noteService.findNote(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/api/notes")
    public List<Note> findNotes() {
        User user = securityService.getAuthenticatedUser();
        return noteService.findNotes(user);
    }

    @DeleteMapping("/api/notes/{id}")
    public void deleteById(@PathVariable Long id) {
        noteService.deleteById(id);
    }

    @PutMapping("/api/notes/{id}")
    public void updateNote(@RequestBody Note note, @PathVariable Long id) throws Exception {
        noteService.updateNote(note, id);

    }


    @GetMapping("/api/tags/{id}/notes")
    public List<Note> findNotesByTagId(@PathVariable Long id) {
        return noteService.findNotesByTagId(id);
    }
}
