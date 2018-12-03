package hu.iit.me.controller.dao;

import hu.iit.me.controller.model.JobData;

import java.util.Collection;

public interface JobDataDAO {

    public Collection<JobData> listJobData();

    public void addNewJob(JobData newjob);

}
