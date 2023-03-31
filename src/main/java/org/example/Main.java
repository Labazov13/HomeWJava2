package org.example;

import org.example.model.Root;

public class Main {
    public static void main(String[] args) {
        Exam1 parser = new Exam1();
        Root root = parser.parse();
        StringBuilder request = new StringBuilder("select * from students where ");
        System.out.println(request.append(root.toString()));
    }
}