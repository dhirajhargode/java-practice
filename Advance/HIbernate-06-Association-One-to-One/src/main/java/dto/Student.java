package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	private Integer studentId;
	private String studentName;
	private String address;

	@OneToOne
	@JoinColumn(name="lib_id",unique=true)
	private LibraryMembership lm;

	public Student() {
	}

	/**
	 * @param studentId
	 * @param studentName
	 * @param address
	 */
	public Student(Integer studentId, String studentName, String address) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}

	public LibraryMembership getLm() {
		return lm;
	}

	public void setLm(LibraryMembership lm) {
		this.lm = lm;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return studentId + " " + studentName + " " + address;
	}

}
