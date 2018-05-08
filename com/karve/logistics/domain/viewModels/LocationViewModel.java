package com.karve.logistics.domain.viewModels;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Component
public class LocationViewModel {
    @NotEmpty(message = "Unit Identifier cannot be empty.")
    private Long unitId
}
