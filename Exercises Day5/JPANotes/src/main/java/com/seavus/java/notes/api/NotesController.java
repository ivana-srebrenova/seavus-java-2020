package com.seavus.java.notes.api;

import com.seavus.java.notes.model.Notes;
import com.seavus.java.notes.model.User;
import com.seavus.java.notes.service.NotesService;
import com.seavus.java.notes.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
public class NotesController {

    private NotesService notesService;
    private SecurityService securityService;

    @Autowired
    public NotesController(NotesService notesService, SecurityService securityService) {
        this.notesService = notesService;
        this.securityService = securityService;
    }

    @PostMapping("/api/notes")
    public Notes createNote(@RequestBody CreateNotesRequest request) {
        return notesService.createNote(request.title, request.content);
    }

    public static class CreateNotesRequest {
        public String title;
        public String content;
    }


    @GetMapping("/api/notes/{id}")
    public Notes findNote(@PathVariable Long id) {
        return notesService.findNote(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/api/notes")
    public List<Notes> findNotes() {
        User user = securityService.getAuthenticatedUser();
        return notesService.findNotes(user);
    }

    @DeleteMapping("/api/notes/{id}")
    public void deleteById(@PathVariable Long id) {
        notesService.deleteById(id);
    }

    @PutMapping("/api/notes/{id}")
    public void updateNote(@RequestBody Notes note, @PathVariable Long id) throws Exception {
        notesService.updateNote(note, id);

    }


    @GetMapping("/api/tags/{id}/notes")
    public List<Notes> findNotesByTagId(@PathVariable Long id) {
        return notesService.findNotesByTagId(id);
    }
}
