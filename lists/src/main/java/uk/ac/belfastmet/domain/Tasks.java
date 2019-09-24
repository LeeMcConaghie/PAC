/**
 * 
 */
package uk.ac.belfastmet.domain;

/**
 
 */
public class Tasks {

	// Lists properties of the class

	private String userName;

	private String description;

	private String completionDate;

	private boolean completed;

	private String name;

	private String priority;

	/**
	 * Constructors Communicates with the model and view. It links Java and Html.
	 * Always uses Capital and has no return type. Name is same as class.
	 * 
	 */

	public Tasks(String userName, String description, String completionDate, boolean completed, String name,
			String priority) {

		this.userName = userName;
		this.description = description;
		this.completionDate = completionDate;
		this.completed = completed;
		this.name = name;
		this.priority = priority;

	}

	// Getters and Setters - get and return properties

	public String getUserName() {

		return userName;
	}

	public String getDescription() {

		return description;
	}

	public String getCompletionDate() {

		return completionDate;
	}

	public boolean getCompleted() {

		return completed;
	}

	public String getName() {

		return name;
	}

	public String getPriority() {

		return priority;
	}
}
