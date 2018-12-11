package hu.iit.me.dao;

import hu.iit.me.controller.Exception.IDIsInvalid;
import hu.iit.me.controller.Exception.WrongSalaryException;
import hu.iit.me.controller.dao.JobDataDAO;
import hu.iit.me.controller.model.Education;
import hu.iit.me.controller.model.JobData;

import java.util.*;

public class JobDataDAOImpl implements JobDataDAO {

    private Collection<JobData> jobDataStorage;

    public JobDataDAOImpl() throws IDIsInvalid, WrongSalaryException {
        jobDataStorage = new ArrayList<>();

        jobDataStorage.add(new JobData(1,"ERandomJob1", Education.MIDDLE_SCHOOL, "Lifting heavy things",1000,"physical work"));
        jobDataStorage.add(new JobData(2,"CRandomJob2", Education. UNIVERSITY, "Data manager",1500,"office work"));
        jobDataStorage.add(new JobData(3,"DRandomJob3", Education.UNIVERSITY, "0-24 paperwork",3500,"office work"));
        jobDataStorage.add(new JobData(4,"ARandomJob4", Education.HIGH_SCHOOL, "Warehouse keeper",2000,"warehouse"));
        jobDataStorage.add(new JobData(5,"BRandomJob5", Education.HIGH_SCHOOL, "School maintainer",1500,"maintenance"));

    }

    @Override
    public Collection<JobData> returnJobData() {
        return jobDataStorage;
    }


    @Override
    public void saveJob(JobData newjob) {
        jobDataStorage.add(newjob);
    }

}
