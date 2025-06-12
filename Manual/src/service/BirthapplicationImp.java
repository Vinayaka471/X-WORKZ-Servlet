package service;

import com.xworkz.DTO.BirthDTO;

public class BirthapplicationImp implements Birthapplicationservice{
    @Override
    public String BirthApplicationValidated(BirthDTO birthDTO) {
        return "Failed";
    }
}
