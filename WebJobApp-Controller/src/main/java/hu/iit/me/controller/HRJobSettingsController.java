package hu.iit.me.controller;

import hu.iit.me.controller.Exception.*;
import hu.iit.me.controller.service.HRJobSettingsService;
import hu.iit.me.controller.service.JobDataService;
import hu.iit.me.converter.Converter;
import hu.iit.me.dto.JobDataXSD;
import hu.iit.me.dto.NameXSD;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@Controller
@RequestMapping("/hr")
public class HRJobSettingsController {

    private HRJobSettingsService hrJobSettingsService;
    private JobDataService jobDataService;

    public HRJobSettingsController(HRJobSettingsService hrJobSettingsService, JobDataService jobDataService) {
        this.hrJobSettingsService = hrJobSettingsService;
        this.jobDataService = jobDataService;
    }

    @PostMapping(value="/addJob")
    public @ResponseBody Collection<JobDataXSD> addNewJob(@RequestBody JobDataXSD newjob) throws JobAlreadyExistException, IDIsInvalid, IDAlreadyExistException, WrongSalaryException, ListIsEmptyException {
        hrJobSettingsService.addNewJob(Converter.unmarshal(newjob));
        return Converter.marshalList(jobDataService.listJobData());
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Collection<NameXSD> listAllJobs() throws ListIsEmptyException {
        return Converter.marshalToNameList(jobDataService.listJobData());
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "The list you requested is empty")
    @ExceptionHandler({ListIsEmptyException.class })
    public void EmptyList(){
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Argument is illegal")
    @ExceptionHandler({IDIsInvalid.class, WrongSalaryException.class})
    public void WrongParameter(){
    }

    @ResponseStatus(value = HttpStatus.CONFLICT, reason = "This job is already in the database. Try it with an another ID or name.")
    @ExceptionHandler({JobAlreadyExistException.class, IDAlreadyExistException.class})
    public void AlreadyExist(){
    }

}
