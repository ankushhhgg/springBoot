package io.jb.springbootstarter.controller.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.jb.springbootstarter.topic.Topic;


@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping(method = RequestMethod.GET,value =  "/topics/{id}/courses")
	public List<Course> getTopics(@PathVariable("id") String topicID) {
		return courseService.getCourses(topicID);
	}
	
	@RequestMapping("/topics/{id}/course/{cid}")
	public Course getTopic(@PathVariable("cid") String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST ,value="/topics/{id}/course")
	public void addTopic(@RequestBody Course course,@PathVariable String id) {
		course.setTopic(new Topic(id, "", ""));
		courseService.addCourse(course);
	}
	

	@RequestMapping(method = RequestMethod.POST ,value="/topics/{id}/course/{cid}")
	public void updateTopic(@RequestBody Course course,@PathVariable("id") String id) {
		course.setTopic(new Topic(id, "", "")); 
		courseService.updateCourse(course,id);
	}
	

	@RequestMapping(method = RequestMethod.DELETE ,value="/topics/{id}/course/del/{cid}")
	public void deleteTopic(@PathVariable("cid") String cid) {
		 courseService.deleteCourse(cid);
	}
}
