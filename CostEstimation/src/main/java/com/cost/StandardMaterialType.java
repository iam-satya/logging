package com.cost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StandardMaterialType extends CostEstimation

{

	float StandardMaterial=1200;
	float ConstructionCost;
	private static final Logger Logger= LogManager.getLogger(StandardMaterialType.class);
	public float MaterialType(float Area)

	{
		Logger.info("This is Standard Material type ");
		 ConstructionCost=StandardMaterial*Area;
		 Logger.debug("cost is"+ConstructionCost);
		 return ConstructionCost;
		
		 
	}
}
