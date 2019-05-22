package com.soplinger;

import com.soplinger.model.UserType;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List getAvailableTypes(UserType type){

        List brands = new ArrayList();

        if(type.equals(UserType.Administrator)){
            brands.add("Adrianna Vineyard");
            brands.add(("J. P. Chenet"));

        }else if(type.equals(UserType.Teacher)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");

        }else if(type.equals(UserType.Student)){
            brands.add("Corona");

        }else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}
