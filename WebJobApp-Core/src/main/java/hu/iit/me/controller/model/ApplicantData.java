package hu.iit.me.controller.model;

public class ApplicantData {

    private int applicantID;
    private String applicantName;
    private int applicantAge;
    private String applicantPhoneNumber;
    private Education applicantEducation;
    private String applicantEmail;
    private String applicantHomeAdress;

    public ApplicantData(int applicantID, String applicantName, int applicantAge, String applicantPhoneNumber, Education applicantEducation, String applicantEmail, String applicantHomeAdress) {
        this.applicantID = applicantID;
        this.applicantName = applicantName;
        this.applicantAge = applicantAge;
        this.applicantPhoneNumber = applicantPhoneNumber;
        this.applicantEducation = applicantEducation;
        this.applicantEmail = applicantEmail;
        this.applicantHomeAdress = applicantHomeAdress;
    }

    public int getApplicantID() {
        return applicantID;
    }

    public void setApplicantID(int applicantID) {
        this.applicantID = applicantID;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }

    public String getApplicantPhoneNumber() {
        return applicantPhoneNumber;
    }

    public void setApplicantPhoneNumber(String applicantPhoneNumber) {
        this.applicantPhoneNumber = applicantPhoneNumber;
    }

    public Education getApplicantEducation() {
        return applicantEducation;
    }

    public void setApplicantEducation(Education applicantEducation) {
        this.applicantEducation = applicantEducation;
    }

    public String getApplicantEmail() {
        return applicantEmail;
    }

    public void setApplicantEmail(String applicantEmail) {
        this.applicantEmail = applicantEmail;
    }

    public String getApplicantHomeAdress() {
        return applicantHomeAdress;
    }

    public void setApplicantHomeAdress(String applicantHomeAdress) {
        this.applicantHomeAdress = applicantHomeAdress;
    }
}
