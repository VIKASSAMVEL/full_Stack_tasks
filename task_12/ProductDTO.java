package com.college.task12;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProductDTO {

    @NotNull(message = "Product name is required")
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String name;

    @Min(value = 1, message = "Price must be positive")
    private double price;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
