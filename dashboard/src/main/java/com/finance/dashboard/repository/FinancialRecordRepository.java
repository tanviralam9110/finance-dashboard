package com.finance.dashboard.repository;

import com.finance.dashboard.entity.FinancialRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialRecordRepository extends JpaRepository<FinancialRecordEntity, Long> {
}
