package ru.ratnikov.springcourse;

import org.springframework.stereotype.Component;

@Component()
public class RapMusic implements Music{

    @Override
    public String getSong() {
        return "cop blows on me";
    }
}
