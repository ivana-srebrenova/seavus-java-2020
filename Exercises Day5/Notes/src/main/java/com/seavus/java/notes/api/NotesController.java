package com.seavus.java.notes.api;

import com.seavus.java.notes.model.Notes;
import com.seavus.java.notes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
public class NotesController {

    private NotesService notesService;

    @Autowired
    public NotesController(NotesService notesService) {
        this.notesService = notesService;
    }

    @PostMapping("/api/notes")
    public void createNote(@RequestBody CreateNotesRequest request) {
        notesService.createNote(request.title, request.content);
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
        return notesService.findNotes();
    }

    @DeleteMapping("/api/notes/{id}")
    public void deleteById(@PathVariable Long id) {
        notesService.deleteById(id);
    }

    @PutMapping("/api/notes/{id}")
    public void updateNote(@RequestBody Notes note, @PathVariable Long id) throws Exception {
        notesService.updateNote(note, id);


    }


}
