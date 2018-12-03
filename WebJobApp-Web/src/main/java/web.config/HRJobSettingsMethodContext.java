package web.config;

import hu.iit.me.controller.service.HRJobSettingsService;
import hu.iit.me.controller.service.HRJobSettingsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HRJobSettingsMethodContext {

    @Bean
    public HRJobSettingsService hrJobSettingsService(){
        return new HRJobSettingsServiceImpl();
    };

}
