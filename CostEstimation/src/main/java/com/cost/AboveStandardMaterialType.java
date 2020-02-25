package com.cost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AboveStandardMaterialType extends CostEstimation
{

	float AboveStandardMaterial=1500;
	float ConstructionCost;
	private static final Logger Logger= LogManager.getLogger(AboveStandardMaterialType.class);

	public float MaterialType(float Area)

	{
		Logger.info("This is Above Standard Material type ");
		 ConstructionCost=AboveStandardMaterial*Area;
		 Logger.debug("cost is"+ConstructionCost);

		 return ConstructionCost;
			

	}
	
	
}
