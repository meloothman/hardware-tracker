package de.melo.hardwaretracker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HardwareController {

    @GetMapping(path = "/deals")
    public ResponseEntity<List<HardwareItem>> getDeals() {
        // Hardcodierte Liste für M1, später kommt das aus der Datenbank
        List<HardwareItem> currentDeals = List.of(
                new HardwareItem("Nvidia RTX 4070 Super", "Gebraucht - eBay", 550.00),
                new HardwareItem("AMD Ryzen 7 7800X3D", "Neu - Mindfactory", 340.00)
        );

        return ResponseEntity.ok(currentDeals);
    }
}