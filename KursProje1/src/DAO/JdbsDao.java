package DAO;

import entities.Category;
import entities.Course;
import entities.Teacher;

public class JdbsDao implements ICategoryDao, ICourseDao, ITeacherDao{
		@Override
		public void add(Category category) {
			System.out.println("JDBC ile veritabanına eklendi " + category.getName());
		}
		@Override
		public void add(Course course) {
			System.out.println("JDBC ile veritabanına eklendi " + course.getName());
		}
		@Override 
		public void add(Teacher teacher) {
			System.out.println("JDBC ile veritabanına eklendi " + teacher.getName());
		}
}
