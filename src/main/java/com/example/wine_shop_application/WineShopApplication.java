package com.example.wine_shop_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;

@SpringBootApplication
public class WineShopApplication
{
	LinkedList<String> list = new LinkedList<>();
	public static void main(String[] args)
	{
		SpringApplication.run(WineShopApplication.class, args);
	}

}
