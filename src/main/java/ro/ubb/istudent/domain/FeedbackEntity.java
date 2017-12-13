package ro.ubb.istudent.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Cristina on 12/13/2017.
 */
@Entity
public class FeedbackEntity implements Serializable{
    @Id
    private long id;
    private StudentEntity studentEntity;
    private String description;

    public FeedbackEntity(long id, StudentEntity studentEntity, String description) {
        this.id = id;
        this.studentEntity = studentEntity;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FeedbackEntity{" +
                "id=" + id +
                ", studentEntity=" + studentEntity +
                ", description='" + description + '\'' +
                '}';
    }
}
