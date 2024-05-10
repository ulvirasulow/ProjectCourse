package business;

import java.util.ArrayList;
import java.util.List;

import DAO.ICourseDao;
import entities.Course;
import logging.ILogger;

public class CourseManager {
	private ILogger[] loggers;
	private ICourseDao courseDao;
	private List<Course> allCourses = new ArrayList<Course>();

	public CourseManager(ILogger[] loggers, ICourseDao courseDao) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getUnitPrice() < 0) {
			throw new Exception("Hata : Kurs Fiyatı 0-dan Küçük Olamaz");
		}
		allCourses.add(course);
		courseDao.add(course);
		for (ILogger logger : loggers) {
			logger.log(course.getName());
		}
	}

	public boolean findCourse(Course course) {

		for (Course currentCourse : allCourses) {
			if (currentCourse.getName().equals(course.getName())) {
				return true;
			}
		}
		return false;

	}
}
