package com.publisher.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.publisher.api.dto.BasketDto;

@Controller
public class BuySellZerodhaPublisherController {

	@PostMapping(value = "/buysell")
	public String indexAngel(Model model) {
		BasketDto basket = new BasketDto();
		List<BasketDto> list = new ArrayList<>();
		basket.setExchange("NSE");
		basket.setQuantity(2);
		basket.setTransactionType("BUY");
		basket.setTradingSymbol("INFY-EQ");
		list.add(basket);
		model.addAttribute("basket", list);
		return "zerodhabuysell";
	}
}
