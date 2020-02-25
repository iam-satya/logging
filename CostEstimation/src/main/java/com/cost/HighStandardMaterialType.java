package com.cost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HighStandardMaterialType extends CostEstimation
{

	float HighStandardMaterial=1800;
	float ConstructionCost;
	private static final Logger Logger= LogManager.getLogger(HighStandardMaterialType.class);

	public float MaterialType(float Area)

	{
		Logger.info("This is High Standard Material type ");

		 ConstructionCost=HighStandardMaterial*Area;
		 Logger.debug("cost is"+ConstructionCost);

		 return ConstructionCost;
	}
}
