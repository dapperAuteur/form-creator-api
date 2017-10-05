package awe.mbl.i130.person.response;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import awe.mbl.i130.form.question.Question;
import awe.mbl.i130.person.Person;
import awe.mbl.i130.person.submission.Submission;

@Entity
public class Response {
	
	@Id
	private String id;
	private String responseText;
	
	@ManyToOne
	private Person person;
	@ManyToOne
	private Question question;
	@ManyToOne
	private Submission submission;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the responseText
	 */
	public String getResponseText() {
		return responseText;
	}
	/**
	 * @param responseText the responseText to set
	 */
	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}
	/**
	 * @return the submission
	 */
	public Submission getSubmission() {
		return submission;
	}
	/**
	 * @param submission the submission to set
	 */
	public void setSubmission(Submission submission) {
		this.submission = submission;
	}
	/**
	 * @param id
	 * @param responseText
	 * @param question
	 * @param submission
	 */
	public Response() {
		
	}
	public Response(String id, String responseText,Person person, Question question, Submission submission) {
		super();
		this.id = id;
		this.responseText = responseText;
		this.person = person;
		this.question = question;
		this.submission = submission;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Response [id=" + id + ", responseText=" + responseText + ", getId()=" + getId() + ", getResponseText()="
				+ getResponseText() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((responseText == null) ? 0 : responseText.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Response other = (Response) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (responseText == null) {
			if (other.responseText != null)
				return false;
		} else if (!responseText.equals(other.responseText))
			return false;
		return true;
	}
	
}
