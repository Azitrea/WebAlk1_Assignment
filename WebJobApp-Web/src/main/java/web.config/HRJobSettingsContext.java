package web.config;

import hu.iit.me.controller.HRJobSettingsController;
import hu.iit.me.controller.service.HRJobSettingsService;
import hu.iit.me.controller.service.JobDataService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan
public class HRJobSettingsContext {

    private final HRJobSettingsService hrJobSettingsService;
    private final JobDataService jobDataService;

    public HRJobSettingsContext(HRJobSettingsService hrJobSettingsService, JobDataService jobDataService) {
        this.hrJobSettingsService = hrJobSettingsService;
        this.jobDataService = jobDataService;
    }

    @Bean
    public HRJobSettingsController hrJobSettingsController(){
        return new HRJobSettingsController(hrJobSettingsService, jobDataService);
    }

}
