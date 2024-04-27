package com.zig.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alian {
	
	@Autowired
	Laptop lap;
	public void code() {
		lap.compile();
	}
}
