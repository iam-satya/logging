package com.cost;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructionCostTest {
	
MaterialType material=new MaterialType();
	
@Test	
public void test1() {
		
		assertEquals(1440000.0,material.type(1200,"StandardMaterial"),0.0f); 	
	}

}
