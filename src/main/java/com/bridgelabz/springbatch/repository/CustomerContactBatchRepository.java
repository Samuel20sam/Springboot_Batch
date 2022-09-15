package com.bridgelabz.springbatch.repository;

import com.bridgelabz.springbatch.entity.CustomerContactBatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerContactBatchRepository extends JpaRepository<CustomerContactBatchEntity,Integer> {

}