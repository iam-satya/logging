package com.cost;

public class MaterialType {

	CostEstimation  estimation;
	
	public float type(float Area, String material_type)
	{
		if(material_type.equals("StandardMaterial"))
				estimation =new StandardMaterialType();
		else if(material_type.equals("AboveStandardMaterial"))
				estimation =new AboveStandardMaterialType();
		else if(material_type.equals("HighStandardMaterial"))
			estimation =new HighStandardMaterialType();
		else if(material_type.equals("AboveStandardMaterial"))
			estimation =new HighStandardAndFullyAutomated();
		return estimation.MaterialType(Area);
	 			
	}
}
