package com.h2Database.demo.config;

import com.h2Database.demo.utils.SystemConstants;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Locale;
import java.util.TimeZone;

@Configuration
public class TestsConfig {

    /**
     * Adiciona uma "cultura" default para o sistema de testes quando não for especificado outro valor.
     */
    @PostConstruct
    public void resolveLocale() {
        Locale.setDefault(SystemConstants.DEFAULT_LOCALE);
        TimeZone.setDefault(SystemConstants.DEFAULT_TIME_ZONE);
    }
}
