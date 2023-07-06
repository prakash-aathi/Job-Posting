package com.job.board.joblisting.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Repository;

import com.job.board.joblisting.model.Post;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Repository
public class SearchRepo {

    @Autowired
    MongoClient mongoClient;

    @Autowired
    MongoConverter mongoConverter;

    public List<Post> findByText(String text) {
        final List<Post> posts = new ArrayList<>();
        MongoDatabase database = mongoClient.getDatabase("jobBoard");
        MongoCollection<Document> collection = database.getCollection("jobPost");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search", 
        new Document("index", "default")
                .append("text", 
        new Document("query", text )
                    .append("path", Arrays.asList("desc", "techs", "profile", "location", "exp")))), 
        new Document("$sort", 
        new Document("exp", 1L)), 
                new Document("$limit", 5L)));
        
        result.forEach(doc -> {
            posts.add(mongoConverter.read(Post.class, doc));
        });
        return posts;
    } 
}
