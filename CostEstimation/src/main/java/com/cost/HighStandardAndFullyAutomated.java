package com.cost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HighStandardAndFullyAutomated  extends CostEstimation
{

	float  HighStandardAndFullyAutomatedType=2500;
	float ConstructionCost;
	private static final Logger Logger= LogManager.getLogger(HighStandardAndFullyAutomated.class);

	public float MaterialType(float Area)

	{
		Logger.info("This is High Standard Material type And Fully Automated ");
		 ConstructionCost=  HighStandardAndFullyAutomatedType*Area;
		 return ConstructionCost;
	}
}
