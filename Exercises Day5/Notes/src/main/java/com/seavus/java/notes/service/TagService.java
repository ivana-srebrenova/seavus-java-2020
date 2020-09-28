package com.seavus.java.notes.service;

import com.seavus.java.notes.model.Tag;
import com.seavus.java.notes.model.User;
import com.seavus.java.notes.repository.TagRepository;
import com.seavus.java.notes.repository.UserRepository;
import com.seavus.java.notes.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TagService {

    private TagRepository tagRepository;
    private UserRepository userRepository;
    private SecurityService securityService;


    @Autowired
    public TagService(TagRepository tagRepository, UserRepository userRepository, SecurityService securityService) {

        this.tagRepository = tagRepository;
        this.userRepository = userRepository;
        this.securityService = securityService;
    }

    public Tag createTag(String name) {
        User user = securityService.getAuthenticatedUser();
        Tag tags = new Tag(name, user);
        return tagRepository.save(tags);

    }

    public Optional<Tag> findByTagId(Long id) {
        return tagRepository.findById(id);

    }

    public void deleteTagById(Long id) {
        tagRepository.deleteById(id);

    }

    public List<Tag> findTags(User user) {

        return tagRepository.findByUser(user);
    }

}




