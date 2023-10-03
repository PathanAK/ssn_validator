package com.asif.ssnwebapi.Service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ValidatorService {

    private List<Integer> ssn = new ArrayList<>();

    public ValidatorService(List<Integer> ssn) {
        listOfSsn();
    }

    public String validate(Integer number) {

        if(ssn.contains(number)) {
            return "Rhode Island";
        }else {
            return "Citizen not belongs to this state";
        }
    }

    private void listOfSsn() {
        ssn.add(900001);
        ssn.add(900002);
        ssn.add(900003);
        ssn.add(900004);
        ssn.add(900005);
        ssn.add(900006);
        ssn.add(900007);
        ssn.add(900008);
        ssn.add(900009);
        ssn.add(900010);
    }
}
