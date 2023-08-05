package com.shubhamit.dairy.service.impl;

import com.shubhamit.dairy.entity.Dairy;
import com.shubhamit.dairy.exception.ResourceNotFoundException;
import com.shubhamit.dairy.helper.AppConstants;
import com.shubhamit.dairy.repository.DairyRepository;
import com.shubhamit.dairy.service.DairyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class DairyServiceImpl implements DairyService {
    private final DairyRepository dairyRepository;

    @Override
    public Dairy saveDairy(Dairy dairy) {
log.info("Initiated Dao Call for save Dairy");
        return this.dairyRepository.save(dairy);

    }

    @Override
    public List<Dairy> getAllDairy() {

      return   this.dairyRepository.findAll();
    }

    @Override
    public Dairy getDairyById(int id) {
     return   this.dairyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(AppConstants.NOT_FOUND));
    }

    @Override
    public List<Dairy> searchDairy(String keyword) {
       return this.dairyRepository.findByNameContaining(keyword);
    }




}
