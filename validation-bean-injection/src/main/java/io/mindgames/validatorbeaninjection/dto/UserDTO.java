package io.mindgames.validatorbeaninjection.dto;

import io.mindgames.validatorbeaninjection.controller.Gender;
import io.mindgames.validatorbeaninjection.validator.Enum;
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
