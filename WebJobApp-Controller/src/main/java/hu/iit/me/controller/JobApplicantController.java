package hu.iit.me.controller;

import hu.iit.me.controller.model.JobData;
import hu.iit.me.controller.service.JobDataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;


@Controller
@RequestMapping("/searchJob")
public class JobApplicantController {

    private JobDataService jobDataService;

    public JobApplicantController(JobDataService jobDataService) {
        this.jobDataService = jobDataService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobData> listAllJobs(){return jobDataService.listJobData();}
}
