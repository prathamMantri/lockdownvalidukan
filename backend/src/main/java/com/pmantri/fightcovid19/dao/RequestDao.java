package com.pmantri.fightcovid19.dao;

import com.pmantri.fightcovid19.models.Request;
import com.pmantri.fightcovid19.models.Requester;

public interface RequestDao {
    void postRequest(Requester requester, Request request);
    Boolean validateUniqueVolunteer(String type, String value);
}
