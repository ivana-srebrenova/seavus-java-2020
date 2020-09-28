package com.seavus.java.notes.api;

import com.seavus.java.notes.model.Tag;
import com.seavus.java.notes.model.User;
import com.seavus.java.notes.service.NotesService;
import com.seavus.java.notes.service.TagService;
import com.seavus.java.notes.security.SecurityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TagController {

    private TagService tagService;
    private SecurityService securityService;

    public TagController(TagService tagService, SecurityService securityService) {
        this.tagService = tagService;
        this.securityService = securityService;
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


}


