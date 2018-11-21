package web.config;

import hu.iit.me.controller.dao.JobDataDAO;
import hu.iit.me.controller.service.JobDataService;
import hu.iit.me.controller.service.JobDataServiceImpl;
import hu.iit.me.dao.JobDataDAOImpl;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobApplicantMethodContext {

    @Bean
    public JobDataService jobDataService() {return new JobDataServiceImpl();}

    @Bean
    @Required
    public JobDataDAO jobDataDAO() {return new JobDataDAOImpl();}
}
