package hu.iit.me.controller.dao;

import hu.iit.me.controller.Exception.ListIsEmptyException;
import hu.iit.me.controller.model.Education;
import hu.iit.me.controller.model.JobData;

import java.util.Collection;
import java.util.List;

public interface JobDataDAO {

    public Collection<JobData> returnJobData();

    public void saveJob(JobData newjob);

}
