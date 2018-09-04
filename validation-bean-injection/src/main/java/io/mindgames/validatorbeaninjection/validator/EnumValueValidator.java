package io.mindgames.validatorbeaninjection.validator;

import io.mindgames.validatorbeaninjection.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EnumValueValidator implements ConstraintValidator<Enum, String> {

    private Enum annotation;

    @Autowired
    OrganizationService organizationService;

    @Override
    public void initialize(Enum annotation) {
        this.annotation = annotation;
    }

    @Override
    public boolean isValid(String valueForValidation, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = false;

        //this is not null and autowired correctly!
        organizationService.create(null);


        if (valueForValidation == null)
            return true;

        Object[] enumValues = this.annotation.enumClass().getEnumConstants();

        if (enumValues != null) {
            for (Object enumValue : enumValues) {
                if (valueForValidation.equals(((java.lang.Enum) enumValue).name())) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }
}
