package business;

import DAO.ITeacherDao;
import entities.Teacher;
import logging.ILogger;

public class TeacherManager {
	private ILogger[] loggers;
	private ITeacherDao teacherDao;

	public TeacherManager(ILogger[] loggers, ITeacherDao teacherDao) {
		this.loggers = loggers;
		this.teacherDao = teacherDao;
	}

	public void add(Teacher teacher) throws Exception {
		teacherDao.add(teacher);

		for (ILogger iLogger : loggers) {
			iLogger.log(teacher.getName());
		}
	}
}
