package com.panda.todoapi.pojo;


import com.mongodb.lang.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Todo(@Id String id, @NonNull String title, String description) {

}
