package ro.ubb.istudent.domain;

/**
 * Created by Cristina on 12/12/2017.
 */

public class Assignment {
    private long id;
    private String feedback;

    public Assignment(long id, String feedback) {
        this.id = id;
        this.feedback = feedback;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
