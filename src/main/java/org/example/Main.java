package org.example;

import io.javalin.Javalin;
import redis.clients.jedis.Jedis;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Connect to Redis running in Docker
        Jedis jedis = new Jedis("localhost", 6379);

        // Start Javalin server on port 3000
        Javalin port = Javalin.create().start(3000);

        // GET /redis -> pings Redis, returns PONG
        port.get("/redis", ctx -> {
            String reply = jedis.ping();
            ctx.json(Map.of("redis", reply));
        });

        System.out.println("Server is running on port 3000");
    }
}