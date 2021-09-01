package com.d2d.creditCard.event;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ApplicationDetail {

    private String firstName;
    private String lastName;
    private Integer annualIncome;
    private String address;
    private String refId;
}
