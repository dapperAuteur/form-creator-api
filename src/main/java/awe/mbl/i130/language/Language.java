package awe.mbl.i130.language;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {
	
	@Id
	private String id;
	private String languageChosen;
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
	 * @return the languageChosen
	 */
	public String getLanguageChosen() {
		return languageChosen;
	}
	/**
	 * @param languageChosen the languageChosen to set
	 */
	public void setLanguageChosen(String languageChosen) {
		this.languageChosen = languageChosen;
	}
	/**
	 * @param id
	 * @param languageChosen
	 */
	public Language() {
		
	}
	public Language(String id, String languageChosen) {
		super();
		this.id = id;
		this.languageChosen = languageChosen;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Language [id=" + id + ", languageChosen=" + languageChosen + ", getId()=" + getId()
				+ ", getLanguageChosen()=" + getLanguageChosen() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((languageChosen == null) ? 0 : languageChosen.hashCode());
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
		Language other = (Language) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (languageChosen == null) {
			if (other.languageChosen != null)
				return false;
		} else if (!languageChosen.equals(other.languageChosen))
			return false;
		return true;
	}

}
