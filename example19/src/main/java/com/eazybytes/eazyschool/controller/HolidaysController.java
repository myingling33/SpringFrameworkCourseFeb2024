package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.enums.Type;
import com.eazybytes.eazyschool.model.Holiday;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HolidaysController {

    @GetMapping("/holidays/{display}")
    public String displayHolidays(@PathVariable String display, Model model) {
                                  // For query parameters
                                  // @RequestParam(required = false) boolean festival,
                                  // @RequestParam(required = false) boolean federal, Model model) {

        // For query parameters
        // model.addAttribute("festival", festival);
        // model.addAttribute("federal", federal);

        if (null != display && display.equals("all")) {
            model.addAttribute("festival", true);
            model.addAttribute("federal", true);
        } else if (null != display && display.equals("federal")) {
            model.addAttribute("federal", true);
        } else if (null != display && display.equals("festival")) {
            model.addAttribute("festival", true);
        }

        List<Holiday> holidays = Arrays.asList(
                new Holiday(" Jan 1 ","New Year's Day", Type.FESTIVAL),
                new Holiday(" Oct 31 ","Halloween", Type.FESTIVAL),
                new Holiday(" Nov 24 ","Thanksgiving Day", Type.FESTIVAL),
                new Holiday(" Dec 25 ","Christmas", Type.FESTIVAL),
                new Holiday(" Jan 17 ","Martin Luther King Jr. Day", Type.FEDERAL),
                new Holiday(" July 4 ","Independence Day", Type.FEDERAL),
                new Holiday(" Sep 5 ","Labor Day", Type.FEDERAL),
                new Holiday(" Nov 11 ","Veterans Day", Type.FEDERAL)
        );
        Type[] types = Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString(),
                    (holidays.stream().filter(holiday -> holiday.getType().equals(type)).collect(Collectors.toList())));
        }
        return "holidays.html";
    }
}
