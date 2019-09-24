/**
 * 
 */
package uk.ac.belfastmet.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.domain.Tasks;

/**
 * Where I make the object public Tasks (String userName, String description,
 * String completionDate, Boolean completed, String name, String priority) {
 * 
 * this.userName = userName; this.description = description; this.completionDate
 * = completionDate; this.completed = completed; this.name = name; this.priority
 * = priority;
 * 
 */

@Service
public class ListsService {
	/**
	 * Here I am creating a private array list which calls the method Tasks and
	 * calls it taskArray I then create a public Arraylist of type Tasks.
	 */
	private ArrayList<Tasks> taskArray;

	public ArrayList<Tasks> getTaskArray() {

		this.taskArray = new ArrayList<Tasks>();

		// Add Tasks next. I have written this as named in the constructors for the
		// moment
		// String userName, String description, String completionDate, Boolean
		// completed, String name, String priority
		this.taskArray.add(new Tasks("username", "description", "completionDate", true, "name", "priority"));
		this.taskArray.add(new Tasks("username2", "description2", "completionDate2", true, "name2", "priority2"));

		return this.taskArray;
	}

}
