package com.example.validForm;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Person {
    @NotNull(message = "Name is required")
    @Size(min = 2, message = "Name should be start at least two characters")
    private String name;

    @NotNull(message = "Age is required")
    @Min(value = 0, message = "Age must be at least zero")
    private int age;

    @NotNull(message = "Post code is required")
    @Size(min = 2, message = "Post code should be in format XX-XXX") //TODO: postcode
    private String postCode;

    @NotNull(message = "Salary is required")
    @Min(value= 2000,message = "Salary should be at least 2000")
    @Max(value= 3000,message = "Salary should be max 3000")
    private long salary;

    @NotNull(message = "You need to accept user condictions")
    @Size( message = "Name should be start at least two characters") //TODO: postcode
    private boolean acceptedCondictionw;
}
