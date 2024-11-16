package com.example;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(/*config*/)
            .get("/", ctx -> {
                String name = ctx.queryParam("name");
                if (name == null) {
                    name = "World";
                }
                String htmlContent = "<html><body><h1>Hello, " + name + ".</h1></body></html>";
                ctx.html(htmlContent);
            })
            .start(7070);
    }
}