package com.ab.counter.Application.Controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.counter.Application.Service.CounterService;

@RestController
@RequestMapping("/counter")
public class CounterController {

	@Autowired
	CounterService counterService;

	@PostMapping("/getCurrent")
	public ResponseEntity<Object> getCount() {
		LinkedHashMap<String, Integer> map = counterService.getCounter();
		return ResponseEntity.ok().body(map.entrySet().toArray()[map.size() - 1]);
	}

	@GetMapping("/getCounterList")
	public ResponseEntity<Object> getCounterList() {
		Map<String, Integer> map = counterService.getCounterList();

		if (map.size() == 0) {
			return ResponseEntity.ok().body("No Counters Available");
		}
		return ResponseEntity.ok().body(map);
	}

}
