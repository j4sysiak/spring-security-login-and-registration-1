package pl.jaceksysiak.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "pl.jaceksysiak.service" })
public class ServiceConfig {
}
