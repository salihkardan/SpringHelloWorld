package me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Salih Kardan
 * @version 08/02/2017.
 */
@EnableAutoConfiguration
@SpringBootApplication
public class MyApplication  {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
