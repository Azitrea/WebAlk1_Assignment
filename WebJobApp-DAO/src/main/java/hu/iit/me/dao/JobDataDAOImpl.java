package hu.iit.me.dao;

import hu.iit.me.controller.dao.JobDataDAO;
import hu.iit.me.controller.model.Education;
import hu.iit.me.controller.model.JobData;

import java.util.*;

public class JobDataDAOImpl implements JobDataDAO {

    private Collection<JobData> jobDataStorage;

    public JobDataDAOImpl(){
        jobDataStorage = new ArrayList<>();

        jobDataStorage.add(new JobData(1,"ERandomJob1", Education.MIDDLE_SCOOL, "Sok munka, kevés fizu",500,"Easy"));
        jobDataStorage.add(new JobData(2,"CRandomJob2", Education. UNIVERSITY, "Fizu?",1500,"Easy"));
        jobDataStorage.add(new JobData(3,"DRandomJob3", Education.UNIVERSITY, "Itt nem kapsz semmit",3500,"ReallyEasy"));
        jobDataStorage.add(new JobData(4,"ARandomJob4", Education.HIGH_SCHOOL, "Kappa",2500,"Hard"));
        jobDataStorage.add(new JobData(5,"BRandomJob5", Education.HIGH_SCHOOL, "HAHAHHAHAHHAHA",1500,"Nope"));

    }

    @Override
    public Collection<JobData> returnJobData() {
        return jobDataStorage;
    }

    @Override
    public Collection<JobData> returnJobSortedByName() {
        ArrayList<JobData> jobData = new ArrayList(jobDataStorage);


        Collections.sort(jobData, new Comparator<JobData>() {
            @Override
            public int compare(JobData o1, JobData o2) {
                return o1.getJobName().compareToIgnoreCase(o2.getJobName());
            }
        });

        return jobData;
    }

    @Override
    public Collection<JobData> returnJobRequiredEducationLevel(Education education) {
        Collection<JobData> jobData = new ArrayList<>();

        for (JobData jobs : jobDataStorage){
            if(jobs.getJobRequiredEducation().getNumval() <= education.getNumval()){
                jobData.add(jobs);
            }
        }

        return jobData;
    }

    @Override
    public Collection<JobData> returnJobByName(String name) {
        Collection<JobData> jobData = new ArrayList<>();

        for (JobData jobs : jobDataStorage){
            if(jobs.getJobName().equals(name)){
                jobData.add(jobs);
            }
        }

        return jobData;
    }

    @Override
    public Collection<JobData> returnJobByMinSalary(int salary) {
        Collection<JobData> jobData = new ArrayList<>();

        for (JobData jobs : jobDataStorage){
            if(jobs.getJobSalaryHuf() >= salary){
                jobData.add(jobs);
            }
        }
        return jobData;
    }

    @Override
    public void addNewJob(JobData newjob) {
        jobDataStorage.add(newjob);
    }
}
