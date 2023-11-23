package com.example.validForm;

import lombok.Data;
import lombok.Value;

import javax.validation.constraints.*;

@Data
public class Person {
    @NotNull(message = "Name is required")
    @Size(min = 2, message = "Name should be start at least two characters")
    private String name;

    @NotNull(message = "Age is required")
    @Min(value = 0, message = "Age must be at least zero")
    private int age;

    @NotNull(message = "Postal code is required")
    @Pattern(regexp = "\\d\\d-\\d\\d\\d", message = "Post code should be in format XX-XXX")
    private String postalCode;

    @NotNull(message = "Salary is required")
    @Min(value= 2000,message = "Salary should be at least 2000")
    @Max(value= 3000,message = "Salary should be at most 3000")
    private long salary;

    @NotNull(message = "Conditions must be accepted")
    private boolean acceptedCondictions;
}
