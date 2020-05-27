package io.jb.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getTopics();
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable("id") String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST ,value="/topic")
	public void addTopic(@RequestBody Topic topic) {
		 topicService.addTopic(topic);
	}
	

	@RequestMapping(method = RequestMethod.POST ,value="/topic/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable("id") String id) {
		 topicService.updateTopic(topic,id);
	}
	

	@RequestMapping(method = RequestMethod.DELETE ,value="/topic/del/{id}")
	public void deleteTopic(@PathVariable("id") String id) {
		 topicService.deleteTopic(id);
	}
}
