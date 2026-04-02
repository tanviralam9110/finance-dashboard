package com.finance.dashboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class FinancialRecord {

    @Id
    @GeneratedValue
    private Long id;

    private Double amount;
    private String type; // INCOME / EXPENSE
    private String category;
    private LocalDate date;
    private String notes;

}
