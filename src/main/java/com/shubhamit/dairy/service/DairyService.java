package com.shubhamit.dairy.service;

import com.shubhamit.dairy.entity.Dairy;

import java.util.List;

public interface DairyService {

    Dairy saveDairy(Dairy dairy);

List<Dairy> getAllDairy();

 Dairy getDairyById(int id);

    List<Dairy> searchDairy(String keyword);

}
