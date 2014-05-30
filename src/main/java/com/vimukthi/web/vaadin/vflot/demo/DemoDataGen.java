/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Vimukthi
 *
 */
public class DemoDataGen {
	
	public static Map<Object, Object> getRandomData(int numberOfPoints, int amplitude){
		Map<Object, Object> data = new LinkedHashMap<Object, Object>();
		Random randomGenerator = new Random();
		for (int j = 0; j < numberOfPoints; j++) {
			data.put(j, randomGenerator.nextFloat() * amplitude);
		}
		return data;		
	}

}
