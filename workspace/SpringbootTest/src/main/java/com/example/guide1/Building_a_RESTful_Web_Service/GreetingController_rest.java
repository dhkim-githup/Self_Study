package com.example.guide1.Building_a_RESTful_Web_Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.example.guide1.Building_a_RESTful_Web_Service.vo.Greeting;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController_rest {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting_strig")
    public String greeting_strig(){
        return "Hi";
    }

    @GetMapping("/greeting_rest")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/greeting_map")
    public Map<String, Object> greeting_map(@RequestParam(value = "name", defaultValue = "World") String name) {

        Map<String, Object> map = new HashMap<>();
        map.put("Name", "Hong");
        map.put("Age",50);
        System.out.println(map);

        return map;
    }

    @GetMapping("/greeting_map_list")
    public List<Map<String,Object>> greeting_map2(@RequestParam(value = "name", defaultValue = "World") String name) {

        Map<String, Object> map = new HashMap<>();
        map.put("Name", "Hong");
        map.put("Age",50);
        System.out.println(map);

        List<Map<String,Object>> list = new ArrayList<>();
        list.add(map);
        System.out.println(list);
        return list;
    }

    @GetMapping("/greeting_map_list_objectmapper")
    public JSONPObject greeting_map3(@RequestParam(value = "name", defaultValue = "World") String name) {

        Map<String, Object> map = new HashMap<>();
        map.put("Name", "Hong");
        map.put("Age",50);
        System.out.println(map);

        List<Map<String,Object>> list = new ArrayList<>();
        list.add(map);
        System.out.println(list);

        ObjectMapper mapper = new ObjectMapper();
        JSONPObject json = new JSONPObject("JSON.parse", list);

        return json;
    }
}