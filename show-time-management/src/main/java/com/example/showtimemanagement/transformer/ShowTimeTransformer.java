package com.example.showtimemanagement.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.showtimemanagement.transformer.mapper.ShowTimeMapper;
import com.example.showtimemanagement.dto.ShowTimeDto;
import com.example.showtimemanagement.model.ShowTime;
import com.example.backendcoreservice.transformer.AbstractTransformer;

@Component
@AllArgsConstructor
public class ShowTimeTransformer implements AbstractTransformer<ShowTime, ShowTimeDto, ShowTimeMapper> {

    private final ShowTimeMapper showtimeMapper;

    @Override
    public ShowTimeMapper getMapper() {
        return showtimeMapper;
    }


}
