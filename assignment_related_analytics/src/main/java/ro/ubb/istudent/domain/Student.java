package ro.ubb.istudent.domain;

import java.util.List;

/**
 * Created by Cristina on 12/12/2017.
 */

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private long groupId;
    private int yearOfGraduation;
    private String countryOfResidence;
    private long gradeBookId;

    public Student(long id, String firstName, String lastName, String gender, int age, long groupId, int yearOfGraduation, String countryOfResidence, long gradeBookId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.groupId = groupId;
        this.yearOfGraduation = yearOfGraduation;
        this.countryOfResidence = countryOfResidence;
        this.gradeBookId = gradeBookId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public long getGradeBookId() {
        return gradeBookId;
    }

    public void setGradeBookId(int gradeBookId) {
        this.gradeBookId = gradeBookId;
    }
}
