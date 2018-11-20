package hu.iit.me.controller.model;

public class JobData {

    private int jobID;
    private String jobName;
    private Education jobRequiredEducation;
    private String jobDescription;
    private int jobSalaryHuf;
    private String jobCategory;

    public JobData(int jobID, String jobName, Education jobRequiredEducation, String jobDescription, int jobSalaryHuf, String jobCategory) {
        this.jobID = jobID;
        this.jobName = jobName;
        this.jobRequiredEducation = jobRequiredEducation;
        this.jobDescription = jobDescription;
        this.jobSalaryHuf = jobSalaryHuf;
        this.jobCategory = jobCategory;
    }


    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Education getJobRequiredEducation() {
        return jobRequiredEducation;
    }

    public void setJobRequiredEducation(Education jobRequiredEducation) {
        this.jobRequiredEducation = jobRequiredEducation;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public int getJobSalaryHuf() {
        return jobSalaryHuf;
    }

    public void setJobSalaryHuf(int jobSalaryHuf) {
        this.jobSalaryHuf = jobSalaryHuf;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }
}
