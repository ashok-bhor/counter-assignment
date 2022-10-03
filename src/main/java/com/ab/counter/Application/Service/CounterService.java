package com.ab.counter.Application.Service;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Service;

import com.ab.counter.Application.CounterConstants;

@Service
public class CounterService {

	private static LinkedHashMap<String, Integer> counterMap = new LinkedHashMap<String, Integer>();

	private static int i = 1;

	public LinkedHashMap<String, Integer> getCounter() {

		if (counterMap.size() == 0) {
			counterMap.put(CounterConstants.mapKey + i, i);
			i++;
			return counterMap;
		}
		counterMap.put(CounterConstants.mapKey + i, i);
		i++;
		return counterMap;
	}

	public LinkedHashMap<String, Integer> getCounterList() {
		return counterMap;
	}

}
