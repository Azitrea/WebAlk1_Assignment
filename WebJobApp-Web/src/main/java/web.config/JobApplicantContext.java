package web.config;


import hu.iit.me.controller.JobApplicantController;
import hu.iit.me.controller.service.JobDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan
public class JobApplicantContext {

    private final JobDataService jobDataService;

    @Autowired
    public JobApplicantContext(JobDataService jobDataService) {
        this.jobDataService = jobDataService;
    }

    @Bean
    public JobApplicantController jobApplicantController() {return new JobApplicantController(jobDataService);}
}
