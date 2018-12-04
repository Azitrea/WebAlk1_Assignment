package hu.iit.me.controller.service;

import hu.iit.me.controller.Exception.ListIsEmptyException;
import hu.iit.me.controller.Exception.WrongFunctionParameterException;
import hu.iit.me.controller.dao.JobDataDAO;
import hu.iit.me.controller.model.Education;
import hu.iit.me.controller.model.JobData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

public class JobDataServiceImpl implements JobDataService {

    @Autowired
    private JobDataDAO jobDataDAO;

    @Override
    public Collection<JobData> listJobData() throws ListIsEmptyException {

        if(jobDataDAO.returnJobData().isEmpty()){
            throw new ListIsEmptyException();
        }

        return jobDataDAO.returnJobData();
    }

    @Override
    public Collection<JobData> listJobsSortedByName() throws ListIsEmptyException {

        if(jobDataDAO.returnJobSortedByName().isEmpty()){
            throw new ListIsEmptyException();
        }

        return jobDataDAO.returnJobSortedByName();
    }

    @Override
    public Collection<JobData> listJobsByRequiredEducationLevel(Education education) throws ListIsEmptyException, WrongFunctionParameterException {

        if(education == null){
            throw new WrongFunctionParameterException();
        }

        if(jobDataDAO.returnJobRequiredEducationLevel(education).isEmpty()){
            throw new ListIsEmptyException();
        }

        return jobDataDAO.returnJobRequiredEducationLevel(education);
    }

    @Override
    public Collection<JobData> listJobByName(String name) throws ListIsEmptyException, WrongFunctionParameterException {

        if(name.equals(null)){
            throw new WrongFunctionParameterException();
        }

        if(jobDataDAO.returnJobByName(name).isEmpty()){
            throw new ListIsEmptyException();
        }

        return jobDataDAO.returnJobByName(name);
    }

    @Override
    public Collection<JobData> listJobByMinSalary(int salary) throws ListIsEmptyException, WrongFunctionParameterException {

        if(salary < 0){
            throw new WrongFunctionParameterException();
        }

        if(jobDataDAO.returnJobByMinSalary(salary).isEmpty()){
            throw new ListIsEmptyException();
        }

        return jobDataDAO.returnJobByMinSalary(salary);
    }
}
