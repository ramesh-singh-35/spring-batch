package com.alphacoder.config;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.integration.config.annotation.EnableBatchIntegration;
import org.springframework.batch.integration.partition.RemotePartitioningManagerStepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
@EnableBatchIntegration
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class ManagerConfig {
    private final JobBuilderFactory jobBuilderFactory;
    private RemotePartitioningManagerStepBuilderFactory stepBuilderFactory;


}
