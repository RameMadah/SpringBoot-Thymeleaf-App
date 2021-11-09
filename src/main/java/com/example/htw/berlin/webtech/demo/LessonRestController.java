/*
package com.example.htw.berlin.webtech.demo;

import com.example.htw.berlin.webtech.demo.service.LessonService;
import com.example.htw.berlin.webtech.demo.service.UserService;
import com.example.htw.berlin.webtech.demo.web.api.Lesson;
import com.example.htw.berlin.webtech.demo.web.api.LessonCreateRequest;
import com.example.htw.berlin.webtech.demo.web.api.User;
import com.example.htw.berlin.webtech.demo.web.api.UserCreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class LessonRestController {

    private final LessonService lessonService;

    public LessonRestController(LessonService lessonService) {
        this.lessonService = lessonService;
    }


    @GetMapping(path = "/api/v1/Lessons")
    public ResponseEntity<List<Lesson>> fetchLessons() {
        return ResponseEntity.ok(lessonService.findAll()) ;
    }



    @PostMapping(path = "/api/v1/lessons")
    public ResponseEntity<Void> CreateLesson(@RequestBody LessonCreateRequest request) throws URISyntaxException {

        var lesson = lessonService.createl( request );
        URI uri = new URI("/api/v1/lessons/"+ lesson.getTitle());
        return ResponseEntity.created(uri).build();

    }



}
*/