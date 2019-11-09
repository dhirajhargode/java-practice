package dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LibraryMember")
public class LibraryMembership {

	@Id
	private Integer libId;
	private Date dateOfJoining;

	public LibraryMembership() {
	}

	/**
	 * @param libId
	 * @param dateOfJoining
	 */
	public LibraryMembership(Integer libId, Date dateOfJoining) {
		this.libId = libId;
		this.dateOfJoining = dateOfJoining;
	}

	public Integer getLibId() {
		return libId;
	}

	public void setLibId(Integer libId) {
		this.libId = libId;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "LibraryMembership [libId=" + libId + ", dateOfJoining=" + dateOfJoining + "]";
	}

}
