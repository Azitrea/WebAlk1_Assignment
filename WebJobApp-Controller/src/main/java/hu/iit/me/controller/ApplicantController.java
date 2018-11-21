package hu.iit.me.controller;

import hu.iit.me.controller.model.ApplicantData;
import hu.iit.me.controller.service.ApplicantDataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;


@Controller
@RequestMapping("/applicant")
public class ApplicantController {

    private ApplicantDataService applicantDataService;

    public ApplicantController(ApplicantDataService applicantDataService) {
        this.applicantDataService = applicantDataService;
    }

    @RequestMapping(value="/list", method = RequestMethod.GET)
    @ResponseBody
    /*public String lisAllApplicants(){
        return applicantDataService.applicantList().toString();
    }*/
    public Collection<ApplicantData> listAllApplicants(){
        return applicantDataService.applicantList();
    }
}
