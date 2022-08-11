package com.example.convertion.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.convertion.model.User;

@Component
public class Processor implements ItemProcessor<User, User>
{
    @Override
    public User process(User user) throws Exception
    {
        return user;
    }
}