package de.melo.hardwaretracker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HardwareItem {
    private String name;
    private String condition;
    private double referencePrice;
}