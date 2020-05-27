package io.jb.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

import io.jb.springbootstarter.topic.Topic;

public interface TopicRepo extends CrudRepository<Topic,String> {

	
}
