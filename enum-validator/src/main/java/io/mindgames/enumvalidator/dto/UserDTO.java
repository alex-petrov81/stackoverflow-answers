package io.mindgames.enumvalidator.dto;

import io.mindgames.enumvalidator.controller.Gender;
import io.mindgames.enumvalidator.validator.Enum;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class UserDTO {
    @Enum(enumClass = Gender.class)
    private String gender;

    @NotEmpty
    @Size(min = 2, max = 250)
    private String fullName;
}
