package hu.iit.me.controller.service;

import hu.iit.me.controller.dao.JobDataDAO;
import hu.iit.me.controller.model.JobData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class JobDataServiceImpl implements JobDataService {

    @Autowired
    private JobDataDAO jobDataDAO;

    @Override
    public Collection<JobData> listJobData() {
        return jobDataDAO.listJobData();
    }
}
