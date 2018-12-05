package web.config;

import hu.iit.me.controller.dao.JobDataDAO;
import hu.iit.me.controller.service.HRJobSettingsService;
import hu.iit.me.controller.service.HRJobSettingsServiceImpl;
import hu.iit.me.controller.service.JobDataService;
import hu.iit.me.controller.service.JobDataServiceImpl;
import hu.iit.me.dao.JobDataDAOImpl;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HRJobSettingsMethodContext {

    @Bean
    public HRJobSettingsService hrJobSettingsService(){
        return new HRJobSettingsServiceImpl();
    }

}

