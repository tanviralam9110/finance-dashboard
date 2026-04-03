package com.finance.dashboard.controller;

import com.finance.dashboard.entity.FinancialRecord;
import com.finance.dashboard.service.FinancialService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/records")
public class FinancialContoller {

    private FinancialService financialService;

    public FinancialContoller(FinancialService financialService){
        this.financialService = financialService;
    }


    @GetMapping("/")
    public String home() {
        return "Finance Dashboard Backend Running ";
    }

    @PostMapping
    public FinancialRecord create(@RequestBody FinancialRecord record){
        return financialService.save(record);
    }

    @GetMapping
    public List<FinancialRecord> getAll(){
        return financialService.getAll();
    }

    @GetMapping("/summary")
    public Map<String, Double> summary(){
        return financialService.getSummary();
    }
}