package hu.iit.me.controller.service;

import hu.iit.me.controller.dao.ApplicantDataDAO;
import hu.iit.me.controller.model.ApplicantData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class ApplicantDataServiceImpl implements ApplicantDataService {

    @Autowired
    private ApplicantDataDAO applicantDataDAO;

    @Override
    public Collection<ApplicantData> applicantList() {
        return applicantDataDAO.listApplicantData();
    }
}
