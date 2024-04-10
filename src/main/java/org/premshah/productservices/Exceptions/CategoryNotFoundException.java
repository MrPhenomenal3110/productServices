package org.premshah.productservices.Exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryNotFoundException extends RuntimeException {
    String category;
    public CategoryNotFoundException(String category, String message) {
        super(message);
        this.category = category;
    }
}
