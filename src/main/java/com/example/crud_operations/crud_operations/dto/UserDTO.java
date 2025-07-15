package com.example.crud_operations.crud_operations.dto;


// Nje klase DTO (data transfer object) eshte nje objekt i thjesht qe pedoret per te transferuar te dhena me backend dhe frontend
// Ofron siguri me te larte

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
    // kur krijon ose merr nje user perdor userDTO per input ose output qe mos te shfaqet id dhe password
    private String name;
    private String email;
}
