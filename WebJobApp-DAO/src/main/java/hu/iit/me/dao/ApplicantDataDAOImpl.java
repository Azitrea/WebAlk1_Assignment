package hu.iit.me.dao;

import hu.iit.me.controller.dao.ApplicantDataDAO;
import hu.iit.me.controller.model.ApplicantData;
import hu.iit.me.controller.model.Education;

import java.util.ArrayList;
import java.util.Collection;

public class ApplicantDataDAOImpl implements ApplicantDataDAO {

    private Collection<ApplicantData> applicantDataStorage;

    public ApplicantDataDAOImpl() {
        applicantDataStorage = new ArrayList<>();

        applicantDataStorage.add(new ApplicantData(1,"Adam", 19,"06307693645", Education.HIGH_SCOOL,"wut@gmail.com","Miskolc, Ezazutca 11"));
        applicantDataStorage.add(new ApplicantData(2,"Eva", 33,"06304567893", Education.MIDDLE_SCOOL,"asd@gmail.com","Miskolc, Amaz 12"));
        applicantDataStorage.add(new ApplicantData(3,"Mark", 22,"06204523345", Education.UNIVERSITY,"lel@gmail.com","Miskolc, Hello 11"));
        applicantDataStorage.add(new ApplicantData(4,"Noname", 24,"06204567775", Education.HIGH_SCOOL,"nana@gmail.com","Miskolc, Bello 11"));


    }

    @Override
    public Collection<ApplicantData> listApplicantData() {
        return applicantDataStorage;
    }
}
