package io.jb.springbootstarter.controller.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course,String> {

	List<Course> findByTopicId(String TopicId);
	
}
