package uk.ac.belfastmet.tasks.services;

import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.tasks.domain.Task;

/**
 * @author MCC19171860
 *
 */
@Service
public class TasksServices {
	
	Logger log = LoggerFactory.getLogger(TasksServices.class);

	// ArrayList containing all tasks from getTasks()
	private ArrayList<Task> tasks;

	/**
	 * method to populate task array
	 * @return tasks array
	 */
	public ArrayList<Task> getTasks() {
		log.info("instantiating java array ");
		this.tasks = new ArrayList<Task>();

		/*
		 * Task constructor order
		 * Task(String userName, String taskName, String description,
		 * String priority, String completionDate, String completed)
		 */
		
		this.tasks.add(new Task("user name", "task name", "description", "priority", "false", ""));
		this.tasks.add(new Task("user name2", "task Name2", "description2", "priority2", "true", ""));
		
		log.info(" tasks array populated ");
		
		return tasks;
	}

}
