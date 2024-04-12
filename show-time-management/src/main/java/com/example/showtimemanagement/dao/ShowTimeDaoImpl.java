package com.example.showtimemanagement.dao;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.showtimemanagement.dao.repo.ShowTimeRepo;

@Component
@AllArgsConstructor
public class ShowTimeDaoImpl implements ShowTimeDao {

    private final ShowTimeRepo showtimeRepo;

    @Override
    public ShowTimeRepo getRepo() {
        return showtimeRepo;
    }


}
