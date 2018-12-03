package hu.iit.me.controller;

import hu.iit.me.controller.service.HRJobSettingsService;
import hu.iit.me.converter.Converter;
import hu.iit.me.dto.JobDataXSD;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/hr")
public class HRJobSettingsController {

    private HRJobSettingsService hrJobSettingsService;

    public HRJobSettingsController(HRJobSettingsService hrJobSettingsService) {
        this.hrJobSettingsService = hrJobSettingsService;
    }

    @PostMapping(value="/addJob")
    public @ResponseBody String addNewJob(@RequestBody JobDataXSD newjob){
        hrJobSettingsService.addNewJob(Converter.unmarshal(newjob));
        return "OK";
    }
}
