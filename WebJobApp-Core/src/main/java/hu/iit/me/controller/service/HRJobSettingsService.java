package hu.iit.me.controller.service;

import hu.iit.me.controller.Exception.IDAlreadyExistException;
import hu.iit.me.controller.Exception.JobAlreadyExistException;
import hu.iit.me.controller.Exception.WrongSalaryException;
import hu.iit.me.controller.model.JobData;

public interface HRJobSettingsService {

    public void addNewJob(JobData newjob) throws JobAlreadyExistException, IDAlreadyExistException, WrongSalaryException;

}

