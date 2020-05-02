package br.com.bmnds.springmvc.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TelephoneValidator implements ConstraintValidator<Telephone, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value.matches("[0-9]{9}");
	}

}
