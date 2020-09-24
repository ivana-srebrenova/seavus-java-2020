package com.seavus.java.Notes.api;

import com.seavus.java.Notes.Model.Notes;
import com.seavus.java.Notes.Service.NotesService;
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
    public void createNotes(@RequestBody CreateNotesRequest request) {
        notesService.createNotes(request.title, request.content);
    }

    public static class CreateNotesRequest {
        public String title;
        public String content;
    }


    @GetMapping("/api/notes/{id}")
   public Notes findNote(@PathVariable Long id) { return notesService.findNote(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
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
    public void updateNotes(@RequestBody Notes note, @PathVariable Long id) {
        notesService.updateNotes(note, id);


    }


}
