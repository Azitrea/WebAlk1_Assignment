package web.config;

import hu.iit.me.controller.ApplicantController;
import hu.iit.me.controller.dao.ApplicantDataDAO;
import hu.iit.me.controller.service.ApplicantDataService;
import hu.iit.me.controller.service.ApplicantDataServiceImpl;
import hu.iit.me.dao.ApplicantDataDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@Configuration
@ComponentScan
public class ApplicantContext {

    private final ApplicantDataService applicantDataService;

    @Autowired
    public ApplicantContext(ApplicantDataService applicantDataService) {
        this.applicantDataService = applicantDataService;
    }

    @Bean()
    public ApplicantController applicantController(){
        return new ApplicantController(applicantDataService);
    }

}
