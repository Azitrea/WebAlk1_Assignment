package hu.iit.me.controller;

import hu.iit.me.controller.Exception.*;
import hu.iit.me.controller.service.JobDataService;
import hu.iit.me.converter.Converter;
import hu.iit.me.dto.JobDataXSD;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public Collection<JobDataXSD> listJobByMinEducation(@RequestParam(value = "education")String education) throws ListIsEmptyException, WrongFunctionParameterException{
       return Converter.marshalList(jobDataService.listJobsByRequiredEducationLevel(education));
    }

    @RequestMapping(value = "/listByJobName", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDataXSD> listJobByName(@RequestParam(value = "name") String name) throws ListIsEmptyException, WrongFunctionParameterException{
        return Converter.marshalList(jobDataService.listJobByName(name));
    }

    @RequestMapping(value = "/listByMinSalary", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDataXSD> listJobByMinSalary(@RequestParam(value = "minSalary") int minSalary) throws AmountIsTooMutch, WrongSalaryException {
        return Converter.marshalList(jobDataService.listJobByMinSalary(minSalary));
    }


    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "The list you requested is empty")
    @ExceptionHandler({ListIsEmptyException.class })
    public void EmptyList(){
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Argument is illegal")
    @ExceptionHandler({IDIsInvalid.class, WrongSalaryException.class, WrongFunctionParameterException.class})
    public void WrongParameter(){
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "The amount you gave is too mutch")
    @ExceptionHandler(AmountIsTooMutch.class)
    public void AmountTooMutch(){
    }

}
