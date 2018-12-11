package hu.iit.me.controller.service;

import hu.iit.me.controller.Exception.ListIsEmptyException;
import hu.iit.me.controller.Exception.WrongFunctionParameterException;
import hu.iit.me.controller.Exception.WrongSalaryException;
import hu.iit.me.controller.dao.JobDataDAO;
import hu.iit.me.controller.model.Education;
import hu.iit.me.controller.model.JobData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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

        ArrayList<JobData> jobData = new ArrayList(jobDataDAO.returnJobData());

        if(jobData.isEmpty()){
            throw new ListIsEmptyException();
        }

        Collections.sort(jobData, new Comparator<JobData>() {
            @Override
            public int compare(JobData o1, JobData o2) {
                return o1.getJobName().compareToIgnoreCase(o2.getJobName());
            }
        });

        return jobData;
    }

    @Override
    public Collection<JobData> listJobsByRequiredEducationLevel(String educationString) throws ListIsEmptyException, WrongFunctionParameterException {
        Collection<JobData> jobData = new ArrayList<>();

        if(educationString == null){
            throw new WrongFunctionParameterException();
        }

        Education education = null;
        for (Education edu : Education.values()) {
            if (edu.name().equalsIgnoreCase(educationString)) {
                education = edu;
            }
        }

        if (education == null){
            throw new WrongFunctionParameterException();
        }


        for (JobData jobs : jobDataDAO.returnJobData()){
            if(jobs.getJobRequiredEducation().getNumval() <= education.getNumval()){
                jobData.add(jobs);
            }
        }

        if(jobData.isEmpty()){
            throw new ListIsEmptyException();
        }

        return jobData;
    }

    @Override
    public Collection<JobData> listJobByName(String name) throws ListIsEmptyException, WrongFunctionParameterException {
        Collection<JobData> jobData = new ArrayList<>();

        if(name.equals(null)){
            throw new WrongFunctionParameterException();
        }

        for (JobData jobs : jobDataDAO.returnJobData()){
            if(jobs.getJobName().equals(name)){
                jobData.add(jobs);
            }
        }

        if(jobData.isEmpty()){
            throw new ListIsEmptyException();
        }

        return jobData;
    }

    @Override
    public Collection<JobData> listJobByMinSalary(int salary) throws ListIsEmptyException, WrongSalaryException {
        Collection<JobData> jobData = new ArrayList<>();


        if(salary < 0){
            throw new WrongSalaryException();
        }

        for (JobData jobs : jobDataDAO.returnJobData()){
            if(jobs.getJobSalaryHuf() >= salary){
                jobData.add(jobs);
            }
        }

        if(jobData.isEmpty()){
            throw new ListIsEmptyException();
        }

        return jobData;
    }

}
