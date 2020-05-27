package io.jb.springbootstarter.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.jb.springbootstarter.controller.Topic;

@Service
public class TopicService {

	private static List<Topic> topics=new ArrayList<Topic>(Arrays.asList(new Topic("1", "a", "ad"),new Topic("2", "b", "bd"),new Topic("3", "c", "cd")));
	
	public List<Topic> getTopics(){
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		 topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {

		topics.stream().filter(t -> t.getId().equals(id)).findAny().get();
		
	}

	public void deleteTopic(String id) {
		
		topics.removeIf(t->t.getId().equals(id));
		
		
	}
}
