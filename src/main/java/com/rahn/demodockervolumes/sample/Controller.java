package com.rahn.demodockervolumes.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@RestController
@RequestMapping(value = "sample")
public class Controller {

    @GetMapping(value = "test")
    public String test() {
        return "working";
    }

    @GetMapping(value = "read-file")
    public String readFile() {
        try {
            File myObj = new File("/tmp/rrr.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                return data;
            }
            myReader.close();
            return "nothing inside file";
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "error:" + e.getMessage();
        }
    }
}
