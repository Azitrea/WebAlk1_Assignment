package hu.iit.me.controller;

import hu.iit.me.controller.Exception.ListIsEmptyException;
import hu.iit.me.controller.Exception.WrongFunctionParameterException;
import hu.iit.me.controller.model.Education;
import hu.iit.me.controller.service.JobDataService;
import hu.iit.me.converter.Converter;
import hu.iit.me.dto.JobDataXSD;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    public Collection<JobDataXSD> listAllJobs() throws ListIsEmptyException {
        return Converter.marshalList(jobDataService.listJobData());
    }

    @RequestMapping(value = "/sortByName", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDataXSD> listJobsSortedByName() throws ListIsEmptyException{
        return Converter.marshalList(jobDataService.listJobsSortedByName());
    }

    @RequestMapping(value = "/listByMinEducation", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDataXSD> listJobByMinEducation(@RequestParam(value = "education")Education education) throws ListIsEmptyException, WrongFunctionParameterException{
       return Converter.marshalList(jobDataService.listJobsByRequiredEducationLevel(education));
    }

    @RequestMapping(value = "/listByJobName", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDataXSD> listJobByName(@RequestParam(value = "name") String name) throws ListIsEmptyException, WrongFunctionParameterException{
        return Converter.marshalList(jobDataService.listJobByName(name));
    }

    @RequestMapping(value = "/listByMinSalary", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDataXSD> listJobByMinSalary(@RequestParam(value = "minSalary") int minSalary) throws ListIsEmptyException, WrongFunctionParameterException{
        return Converter.marshalList(jobDataService.listJobByMinSalary(minSalary));
    }
}
