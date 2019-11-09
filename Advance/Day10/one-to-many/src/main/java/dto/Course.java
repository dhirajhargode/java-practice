package dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="course")
public class Course {
	@Id
	@Column(name="course_id")
	private int courseId;
	@Column(name="course_name")
	private String courseName;
	@OneToMany
	@BatchSize(size=2)
	@JoinColumn(name="course_id")
//	@Fetch(FetchMode.JOIN)
	private Set<Subject> subjects = new HashSet<Subject>();
	public Course() {
		super();
	}
	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return courseId + " " + courseName;
	}
	
	
}
