package com.demo_with_spring.demo_with_spring.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@RestController
@CrossOrigin
public class MoonController {

    @PostMapping("/post")
    public String postMoonPhase(@RequestParam(value = "date") String datetime) {
        LocalDateTime ldt = LocalDateTime.parse(datetime);
        LocalDate date = ldt.toLocalDate();
        String phase = calculateMoonPhase(date);
        return String.format("Текущая фаза луны: %s", phase);

    }

    private String calculateMoonPhase(LocalDate date) {
        LocalDate baseDate = LocalDate.of(2000, 1, 6);
        long daysSinceBase = ChronoUnit.DAYS.between(baseDate, date);
        double phase = (daysSinceBase % 29.53) / 29.53;

        if (phase <= 0.03 || phase > 0.97) {
            return "Новолуние";
        } else if (phase <= 0.23) {
            return "Растущий полумесяц";
        } else if (phase <= 0.27) {
            return "Первая четверть";
        } else if (phase <= 0.47) {
            return "Нарастающяя луна";
        } else if (phase <= 0.53) {
            return "Полнолуние";
        } else if (phase <= 0.73) {
            return "Убывающий полумесяц";
        } else if (phase <= 0.77) {
            return "Последняя четверть";
        } else {
            return "Убывающий полумесяц";
        }
    }
}











