package pl.jaceksysiak.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan({ "pl.jaceksysiak.task" })
public class SpringTaskConfig {

}
