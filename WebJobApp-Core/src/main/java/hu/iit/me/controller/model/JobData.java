package hu.iit.me.controller.model;

import hu.iit.me.controller.Exception.IDIsInvalid;
import hu.iit.me.controller.Exception.ListIsEmptyException;
import hu.iit.me.controller.Exception.WrongSalaryException;

public class JobData {

    private int jobID;
    private String jobName;
    private Education jobRequiredEducation;
    private String jobDescription;
    private int jobSalaryHuf;
    private String jobCategory;

    public JobData(int jobID, String jobName, Education jobRequiredEducation, String jobDescription, int jobSalaryHuf, String jobCategory) throws IDIsInvalid, WrongSalaryException  {
        if(jobID == 0 || jobID < 0){
            throw new IDIsInvalid();
        }
        this.jobID = jobID;
        this.jobName = jobName;
        this.jobRequiredEducation = jobRequiredEducation;
        this.jobDescription = jobDescription;
        if (jobSalaryHuf < 0){
            throw new WrongSalaryException();
        }
        this.jobSalaryHuf = jobSalaryHuf;
        this.jobCategory = jobCategory;
    }


    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) throws IDIsInvalid{
        if(jobID == 0 || jobID < 0){
            throw new IDIsInvalid();
        }
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

    public void setJobSalaryHuf(int jobSalaryHuf) throws WrongSalaryException{
        if (jobSalaryHuf < 0){
            throw new WrongSalaryException();
        }
        this.jobSalaryHuf = jobSalaryHuf;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }
}
