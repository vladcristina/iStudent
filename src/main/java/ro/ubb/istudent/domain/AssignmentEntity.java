package ro.ubb.istudent.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Cristina on 12/12/2017.
 */
@Entity
public class AssignmentEntity implements Serializable{
    @Id
    private long id;
    private long studentId;
    private long courseId;
    private FeedbackEntity feedbackEntity;
    private Date date;
    private Date deadline;
    private String description;

    public AssignmentEntity(long id, long studentId, long courseId, FeedbackEntity feedbackEntity, Date date, Date deadline, String description) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.feedbackEntity = feedbackEntity;
        this.date = date;
        this.deadline = deadline;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public FeedbackEntity getFeedbackEntity() {
        return feedbackEntity;
    }

    public void setFeedbackEntity(FeedbackEntity feedbackEntity) {
        this.feedbackEntity = feedbackEntity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AssignmentEntity{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                ", feedbackEntity=" + feedbackEntity +
                ", date=" + date +
                ", deadline=" + deadline +
                ", description='" + description + '\'' +
                '}';
    }
}
