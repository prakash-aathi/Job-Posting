package com.job.board.joblisting.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.board.joblisting.Repository.PostRepo;
import com.job.board.joblisting.Repository.SearchRepo;
import com.job.board.joblisting.model.Post;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class JobController {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private SearchRepo searchRepo;
 
    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }

    @PostMapping("/post")
    public Post createPost(@RequestBody Post post) {
        return postRepo.save(post);
    }

    @GetMapping("/posts/{text}")
    public List<Post> getPostByText(@PathVariable String text) {
        return searchRepo.findByText(text);
    }
    
}
