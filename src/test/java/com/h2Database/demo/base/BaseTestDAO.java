package com.h2Database.demo.base;

import com.h2Database.demo.config.DataBaseTestsSpringConfig;
import com.h2Database.demo.service.PersonService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import java.util.Objects;

@ContextConfiguration(classes = DataBaseTestsSpringConfig.class)
public class BaseTestDAO extends AbstractTransactionalJUnit4SpringContextTests {

    protected PersonService getPersonService() {
        var teste = applicationContext.getBean(PersonService.class);
        return Objects.requireNonNull(applicationContext).getBean(PersonService.class);
    }
}
