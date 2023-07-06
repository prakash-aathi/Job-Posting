package com.job.board.joblisting.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.job.board.joblisting.model.Post;

public interface PostRepo extends MongoRepository<Post,String> {
    
}
