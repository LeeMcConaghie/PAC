package uk.ac.belfastmet.tasks.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author MCC19171860
 *
 */
@Entity
@Table(name = "task")
public class Task {

	// instance vars

	private String userName;

	private String taskName;

	private String description;

	private String priority;

	private String completionDate;

	private String completed;
	
	private long id;
	

	// constructor

	/**
	 * default constructor
	 */
	public Task() {

	}

	/**
	 * constructor with all args
	 * 
	 * @param userName
	 * @param taskName
	 * @param description
	 * @param priority
	 * @param completionDate
	 * @param completed
	 */
	public Task(String userName, String taskName, String description, String priority, String completionDate,
			String completed) {

		this.userName = userName;
		this.taskName = taskName;
		this.description = description;
		this.priority = priority;
		this.completionDate = completionDate;
		this.completed = completed;
	}

	/**
	 * @return the userName
	 */
	@Column(name= "user")
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(long Id) {
	this.id = id;
	}
	/**
	 * @return the taskName
	 */
	@Column(name = "name")
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * @return the description
	 */
	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the priority
	 */
	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * @return the completionDate
	 */
	public String getCompletionDate() {
		return completionDate;
	}

	/**
	 * @param completionDate the completionDate to set
	 */
	/*public void setCompletionDate(String completionDate) {

		this.completionDate = completionDate;*/


	/**
	 * @return the completed
	 */
	@Column(name = "priority")
	public String isCompleted() {
		return completed;
	}
	
	/**
	 * @param completed the completed to set
	 */
	
	public void setCompleted(String completed) {
		this.completed = completed;
	}

	/**
	 * To string method
	 */
	@Override
	public String toString() {
		return "Tasks [userName=" + userName + ", taskName=" + taskName + ", description=" + description + ", /*priority="
				+ priority + ", completionDate=" + completionDate + ", completed=" + completed + "]";
	}

	

}
