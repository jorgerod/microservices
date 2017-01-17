package com.microservices.report.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.report.service.ReportService;

@RestController
@RequestMapping("/report/")
public class ReportController {

    private ReportService reportService;

    public ReportController(ReportService reportService) {
        super();
        this.reportService = reportService;
    }


    @RequestMapping(path = "films", method = RequestMethod.GET)
    public String getFilms() {
        return reportService.getFilms();
    }
}
