package com.example.helloversion2.controllers;


import com.example.helloversion2.models.Quote;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/quotes")
public class QuotesController {
    @GetMapping("/random")
    @ResponseBody

    public ResponseEntity<String> getRandomQuote() {
        List<String> quotes = generateList();
        Random random = new Random();
        int randomInt = random.nextInt(3);
        return new ResponseEntity<>(quotes.get(randomInt), HttpStatus.OK);
    }

    @GetMapping("/random2")
    @ResponseBody
    public ResponseEntity<Quote> getRandomQuote2() {
        List<Quote> quotes = generateList2();
        Random random = new Random();
        int randomInt = random.nextInt(3);
        return new ResponseEntity<>(quotes.get(randomInt), HttpStatus.OK);
    }

    @GetMapping("/random3")
    public ResponseEntity<Object> getRandomQuote3() throws IOException {
        URL url = new URL("https://quote-garden.onrender.com/api/v3/quotes/random");
        BufferedReader inputFromUrl = new BufferedReader(new InputStreamReader(url.openStream()));
        Object quote = new Gson().fromJson(inputFromUrl, Object.class);
        inputFromUrl.close();
        return new ResponseEntity<>(quote, HttpStatus.OK);
    }


    public List<Quote> generateList2() {
        List<Quote> quoteStrings = new ArrayList<>();
        quoteStrings.add(new Quote("You only live once", "August Sørensen", "Motivational"));
        quoteStrings.add(new Quote("You can do it", "August Reinhold", "Inspirational"));
        quoteStrings.add(new Quote("You are an idiot", "August TheMaster", "Damaging"));
        return quoteStrings;
    }


    public List<String> generateList() {
        List<String> quoteStrings = new ArrayList<>();
        quoteStrings.add("You only live once");
        quoteStrings.add("You only live twice");
        quoteStrings.add("You only live three times");

        return quoteStrings;
    }


}
