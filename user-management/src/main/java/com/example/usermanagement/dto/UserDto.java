package com.example.usermanagement.dto;

import com.example.backendcoreservice.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto extends AbstractDto {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String keycloakId;

    private String phoneNumber;

}
