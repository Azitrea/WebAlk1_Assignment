package hu.iit.me.controller.service;

import hu.iit.me.controller.dao.JobDataDAO;
import hu.iit.me.controller.model.JobData;
import org.springframework.beans.factory.annotation.Autowired;

public class HRJobSettingsServiceImpl implements HRJobSettingsService{

    @Autowired
    private JobDataDAO jobDataDAO;

    @Override
    public void addNewJob(JobData newjob) {
        //TODO exception handling



        jobDataDAO.addNewJob(newjob);
    }
}
