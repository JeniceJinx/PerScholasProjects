package model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String projectTitle;
    private String projectTech;
    private String basicConcept;
    private String projectImage;
    private String projectURL;


    public Project(long id, String projectTitle, String projectTech, String basicConcept, String projectImage, String projectURL) {
        this.id = id;
        this.projectTitle = projectTitle;
        this.projectTech = projectTech;
        this.basicConcept = basicConcept;
        this.projectImage = projectImage;
        this.projectURL = projectURL;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectTech() {
        return projectTech;
    }

    public void setProjectTech(String projectTech) {
        this.projectTech = projectTech;
    }

    public String getBasicConcept() {
        return basicConcept;
    }

    public void setBasicConcept(String basicConcept) {
        this.basicConcept = basicConcept;
    }

    public String getProjectImage() {
        return projectImage;
    }

    public void setProjectImage(String projectImage) {
        this.projectImage = projectImage;
    }

    public String getProjectURL() {
        return projectURL;
    }

    public void setProjectURL(String projectURL) {
        this.projectURL = projectURL;
    }

    public String Project() {
        return "Project}" + "id=" + id + '\''
                + "Project Title=" + projectTitle + '\'' + ","
                + "Project Tech " + projectTech + '\'' + ','
                + "Basic Concept" + basicConcept + '\'' + ","
                + "Project Image" + projectImage + '\'' + ","
                + "Project URL" + projectURL + '\'' + ","
                + '}';
    }

    public void setProjectCode(String toString) {
    }
}