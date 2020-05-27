package io.jb.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.jb.springbootstarter.topic.Topic;

@Service
public class TopicService {

	private static List<Topic> topics=new ArrayList<Topic>(Arrays.asList(new Topic("1", "a", "ad"),new Topic("2", "b", "bd"),new Topic("3", "c", "cd")));
	
	@Autowired
	private TopicRepo topicRepo;
	
	public List<Topic> getTopics(){
		List<Topic> topics=new ArrayList<Topic>();
		 topicRepo.findAll().forEach(topics::add);
		 return topics;
	}

	public Topic getTopic(String id) {
//		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		Optional<Topic> tp= topicRepo.findById(id);
		return tp.get();
	}

	public void addTopic(Topic topic) {
		topicRepo.save(topic);
	}

	public void updateTopic(Topic topic, String id) {

		topicRepo.save(topic);
		
	}

	public void deleteTopic(String id) {
		
//		topics.removeIf(t->t.getId().equals(id));
		topicRepo.deleteById(id);
		
		
	}
}
