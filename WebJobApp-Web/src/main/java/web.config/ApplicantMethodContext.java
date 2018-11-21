package web.config;

import hu.iit.me.controller.dao.ApplicantDataDAO;
import hu.iit.me.controller.service.ApplicantDataService;
import hu.iit.me.controller.service.ApplicantDataServiceImpl;
import hu.iit.me.dao.ApplicantDataDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicantMethodContext {


    @Bean
    public ApplicantDataService applicantDataService(){
        return new ApplicantDataServiceImpl();
    }

    @Bean
    public ApplicantDataDAO applicantDataDAO(){
        return new ApplicantDataDAOImpl();
    }

}
