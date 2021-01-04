package com.springrest.springrest.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
private CourseDao courseDao;
	List<Course> list;
	public CourseServiceImpl()
	{
//		list =new ArrayList<>();
//		list.add(new Course(145,"JAVA Core","this coursecontain basic of java"));
//		list.add(new Course(4343,"Spring Boot Course","This is  Spring basic course"));
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
	@Override
	public Course getCourse(long courseId) 
	{
//		Course c=null;
//		for(Course course:list)
//		{
//			if(course.getId() == courseId)
//			{	c=course;
//				break;
//			}
//		}
//		
		// TODO Auto-generated method stub
		return courseDao.getOne(courseId);
	}
	@Override
	public Course addCourse(Course course) {
//	 TODO Auto-generated method stub
//		list.add(course);
		courseDao.save(course);
		
		return course ;
	}
	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e->{
//			if(e.getId()==course.getId())
//			{
//				e.setDescription(course.getDescription());
//				e.setTitle(course.getTitle());
//			}
//		});
		
		
		courseDao.save(course);
		return course;
	}
	
	
	
	
	@Override
	public Course deleteCourse(long parseLong) 
	{
//	list= this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity =courseDao.getOne(parseLong);
		courseDao.delete(entity);
		return entity;
		
	}
	
	

}
