package com.finance.dashboard.service;

import com.finance.dashboard.entity.FinancialRecord;
import com.finance.dashboard.repository.FinancialRecordRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FinancialService {

    private final FinancialRecordRepository repo;

    public FinancialService(FinancialRecordRepository repo) {
        this.repo = repo;
    }

    public FinancialRecord save(FinancialRecord record) {
        return repo.save(record);
    }

    public List<FinancialRecord> getAll() {
        return repo.findAll();
    }

    public Map<String, Double> getSummary() {
        List<FinancialRecord> list = repo.findAll();
        double income = list.stream().filter(r -> "INCOME".equals(r.getType()))
                .mapToDouble(FinancialRecord :: getAmount).sum();

        double expense = list.stream()
                .filter(r -> "EXPENSE".equals(r.getType()))
                .mapToDouble(FinancialRecord::getAmount)
                .sum();
        Map<String, Double> map = new HashMap<>();
        map.put("income", income);
        map.put("expense", expense);
        map.put("balance", income - expense);

        return map;
    }
}
