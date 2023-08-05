package com.shubhamit.dairy.controller;

import com.shubhamit.dairy.entity.Dairy;
import com.shubhamit.dairy.service.DairyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dairy's")
@RequiredArgsConstructor
@Slf4j
public class DairyController {

    private final DairyService dairyService;

    @PostMapping("/")
    public ResponseEntity<Dairy> saveDairy(@RequestBody Dairy dairy) {
        log.info("Initiated request for saveDairy");
        Dairy saveDairy = this.dairyService.saveDairy(dairy);
        log.info("Completed request for saveDairy");
        return new ResponseEntity<>(saveDairy, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dairy> getById(@PathVariable int id){
        log.info("Initiated request for get dairy By id:{}",id);
        Dairy dairyById = this.dairyService.getDairyById(id);
        log.info("Completed request for get dairy By id:{}",id);
        return new ResponseEntity<>(dairyById,HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Dairy>>getAll(){
        log.info("Initiated request for get All Dairy");
        List<Dairy> allDairy = dairyService.getAllDairy();
        log.info("Completed request for get All Dairy");
        return new ResponseEntity<>(allDairy,HttpStatus.OK);
    }
    @GetMapping("/dairy/{keyword}")
    public ResponseEntity<List<Dairy>>searchDairy(@PathVariable String keyword){
        log.info("Initiated request for get Dairy with keyword:{}",keyword);
        List<Dairy> dairies = this.dairyService.searchDairy(keyword);
        log.info("Completed request for get Dairy with keyword:{}",keyword);
        return new ResponseEntity<>(dairies,HttpStatus.OK);
    }
}
