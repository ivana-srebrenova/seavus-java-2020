package com.seavus.java.notes.api;

import com.seavus.java.notes.model.Tag;
import com.seavus.java.notes.model.User;
import com.seavus.java.notes.service.NoteService;
import com.seavus.java.notes.service.TagService;
import com.seavus.java.notes.security.SecurityService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class TagController {

    private TagService tagService;
    private SecurityService securityService;
    private NoteService noteService;

    public TagController(TagService tagService, SecurityService securityService, NoteService noteService) {
        this.tagService = tagService;
        this.securityService = securityService;
        this.noteService = noteService;
    }

    @PostMapping("/api/tags")
    public Tag createTag(@RequestBody CreateNotesRequest request) {
        return tagService.createTag(request.name);
    }

    public static class CreateNotesRequest {
        public String name;
    }


    @DeleteMapping("/api/tags/{id}")
    public void deleteTagById(@PathVariable Long id) {
        Tag tag = tagService.findByTagId(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        noteService.deleteTagFromNote(tag);
        tagService.deleteTagById(id);
    }

    @GetMapping("/api/tags/{id}")
    public Optional<Tag> findTag(@PathVariable Long id) {
        return tagService.findByTagId(id);
    }


    @GetMapping("/api/tags")
    public List<Tag> findTags() {
        User user = securityService.getAuthenticatedUser();
        return tagService.findTags(user);
    }

    @PutMapping("/api/tags/{id}")
    public Tag updateTag(@RequestBody Tag tag, @PathVariable Long id) throws Exception {
        return tagService.updateTag(tag, id);
    }

}


