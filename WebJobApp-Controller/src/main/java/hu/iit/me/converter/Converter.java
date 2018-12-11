package hu.iit.me.converter;

import hu.iit.me.controller.Exception.IDIsInvalid;
import hu.iit.me.controller.Exception.WrongSalaryException;
import hu.iit.me.controller.model.Education;
import hu.iit.me.controller.model.JobData;
import hu.iit.me.dto.JobDataXSD;
import hu.iit.me.dto.NameXSD;


import java.util.ArrayList;
import java.util.Collection;

public class Converter {

    public static JobData unmarshal(JobDataXSD jobDataXSD) throws IDIsInvalid, WrongSalaryException {
        return new JobData(jobDataXSD.getJobID(),
                            jobDataXSD.getJobName(),
                            Education.valueOf(jobDataXSD.getJobRequiredEducation()),
                            jobDataXSD.getJobDescription(),
                            jobDataXSD.getJobSalary(),
                            jobDataXSD.getJobCategory());
    }

    public static JobDataXSD marshal(JobData jobData){
        JobDataXSD jobDataXSD = new JobDataXSD();
        jobDataXSD.setJobID(jobData.getJobID());
        jobDataXSD.setJobName(jobData.getJobName());
        jobDataXSD.setJobRequiredEducation(jobData.getJobRequiredEducation().toString());
        jobDataXSD.setJobDescription(jobData.getJobDescription());
        jobDataXSD.setJobSalary(jobData.getJobSalaryHuf());
        jobDataXSD.setJobCategory(jobData.getJobCategory());

        return jobDataXSD;

    }

    public static NameXSD marshalName(JobData jobData){
        NameXSD nameXSD = new NameXSD();
        nameXSD.setJobId(jobData.getJobID());
        nameXSD.setJobName(jobData.getJobName());

        return nameXSD;
    }

    public static Collection<JobDataXSD> marshalList(Collection<JobData> jobData){
        Collection<JobDataXSD> jobDataXSD = new ArrayList<>();
        for(JobData jdX : jobData){
            jobDataXSD.add(marshal(jdX));
        }

        return jobDataXSD;
    }

    public static Collection<NameXSD> marshalToNameList(Collection<JobData> jobData){
        Collection<NameXSD> nameList = new ArrayList<>();
        for(JobData jdX : jobData){
             nameList.add(marshalName(jdX));
        }
        return nameList;
    }

}
