package com.example.showtimemanagement.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.example.showtimemanagement.dao.ShowTimeDao;
import com.example.showtimemanagement.transformer.ShowTimeTransformer;

@Slf4j
@Service
@AllArgsConstructor
public class ShowTimeServiceImpl implements ShowTimeService {

    private final ShowTimeDao showtimeDao;
    private final ShowTimeTransformer showtimeTransformer;

    @Override
    public ShowTimeDao getDao() {
        return showtimeDao;
    }

    @Override
    public ShowTimeTransformer getTransformer() {
        return showtimeTransformer;
    }
    



}
