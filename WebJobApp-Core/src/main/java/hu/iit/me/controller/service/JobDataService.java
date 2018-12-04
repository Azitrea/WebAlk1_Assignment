package hu.iit.me.controller.service;

import hu.iit.me.controller.Exception.ListIsEmptyException;
import hu.iit.me.controller.Exception.WrongFunctionParameterException;
import hu.iit.me.controller.model.Education;
import hu.iit.me.controller.model.JobData;

import java.util.Collection;

public interface JobDataService {

    public Collection<JobData> listJobData() throws ListIsEmptyException;

    public Collection<JobData> listJobsSortedByName() throws ListIsEmptyException;

    public Collection<JobData> listJobsByRequiredEducationLevel(Education education) throws ListIsEmptyException, WrongFunctionParameterException;

    public Collection<JobData> listJobByName(String name) throws ListIsEmptyException, WrongFunctionParameterException;

    public Collection<JobData> listJobByMinSalary(int salalry) throws ListIsEmptyException, WrongFunctionParameterException;

}
