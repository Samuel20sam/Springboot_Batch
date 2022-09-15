package com.bridgelabz.springbatch.configuration;

import com.bridgelabz.springbatch.entity.CustomerContactBatchEntity;
import org.springframework.batch.item.ItemProcessor;

public class CustomerContactBatchProcessor implements ItemProcessor<CustomerContactBatchEntity,
        CustomerContactBatchEntity> {

    @Override
    public CustomerContactBatchEntity process(CustomerContactBatchEntity customerContactBatchEntity) throws Exception {
        return customerContactBatchEntity;

//        if(customerContactBatchEntity.getCountry().equals("United States")) {
//            return customerContactBatchEntity;
//        }else{
//            return null;
//        }
    }
}