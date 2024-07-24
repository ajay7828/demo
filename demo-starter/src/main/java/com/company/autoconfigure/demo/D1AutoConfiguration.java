package com.company.autoconfigure.demo;

import com.company.demo.D1Configuration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({D1Configuration.class})
public class D1AutoConfiguration {
}

