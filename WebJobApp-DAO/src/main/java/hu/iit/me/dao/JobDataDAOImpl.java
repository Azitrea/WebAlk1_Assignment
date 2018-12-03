package hu.iit.me.dao;

import hu.iit.me.controller.dao.JobDataDAO;
import hu.iit.me.controller.model.Education;
import hu.iit.me.controller.model.JobData;

import java.util.ArrayList;
import java.util.Collection;

public class JobDataDAOImpl implements JobDataDAO {

    private Collection<JobData> jobDataStorage;

    public JobDataDAOImpl(){
        jobDataStorage = new ArrayList<>();

        jobDataStorage.add(new JobData(1,"RandomJob1", Education.MIDDLE_SCOOL, "Sok munka, kevés fizu",500,"Easy"));
        jobDataStorage.add(new JobData(2,"RandomJob2", Education. UNIVERSITY, "Fizu?",1500,"Easy"));
        jobDataStorage.add(new JobData(3,"RandomJob3", Education.UNIVERSITY, "Itt nem kapsz semmit",3500,"ReallyEasy"));
        jobDataStorage.add(new JobData(4,"RandomJob4", Education.HIGH_SCHOOL, "Kappa",2500,"Hard"));
        jobDataStorage.add(new JobData(5,"RandomJob5", Education.HIGH_SCHOOL, "HAHAHHAHAHHAHA",1500,"Nope"));

    }

    @Override
    public Collection<JobData> listJobData() {
        return jobDataStorage;
    }

    @Override
    public void addNewJob(JobData newjob) {
        jobDataStorage.add(newjob);
    }
}
