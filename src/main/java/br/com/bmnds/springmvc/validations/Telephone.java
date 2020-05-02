package br.com.bmnds.springmvc.validations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = TelephoneValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Telephone {
	
	//String message() default "{javax.validation.constraints.NotBlank.message}";
	String message() default "O telefone não é válido";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
