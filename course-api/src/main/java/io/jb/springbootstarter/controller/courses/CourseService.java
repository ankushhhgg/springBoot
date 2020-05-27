package io.jb.springbootstarter.controller.courses;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;;

@Service
public class CourseService {

//	private static List<Course> topics=new ArrayList<Course>(Arrays.asList(new Course("1", "a", "ad"),new Course("2", "b", "bd"),new Course("3", "c", "cd")));
	
	@Autowired
	private CourseRepo courseRepo;
	
	public List<Course> getCourses(String topicId){
		List<Course> topics=new ArrayList<Course>();
		 courseRepo.findByTopicId(topicId).forEach(topics::add);
		 return topics;
	}

	public Course getCourse(String id) {
//		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		Optional<Course> tp= courseRepo.findById(id);
		return tp.get();
	}

	public void addCourse(Course topic) {
		courseRepo.save(topic);
	}

	public void updateCourse(Course topic, String id) {

		courseRepo.save(topic);
		
	}

	public void deleteCourse(String id) {
		
//		topics.removeIf(t->t.getId().equals(id));
		courseRepo.deleteById(id);
		
		
	}
}
