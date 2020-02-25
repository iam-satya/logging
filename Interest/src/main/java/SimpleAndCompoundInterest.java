import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public  class SimpleAndCompoundInterest {
	private static final Logger Logger= LogManager.getLogger(SimpleAndCompoundInterest.class);

	float SimpleInterest;
	float CompoundInterest;
	float TotalAmount;
	public  float simpleInterestCalc(int PrincipleAmount,int RateofInterest,int Time)
	{		
		if(PrincipleAmount<=0)
		{
			Logger.error("Amount value either 0 or negitive");
		}
		Logger.info("simple Interest Calculation ");

		SimpleInterest=(PrincipleAmount*RateofInterest*Time)/100;
		TotalAmount=SimpleInterest+PrincipleAmount;
		Logger.info("Total amount: "+TotalAmount);

		return TotalAmount;
	}
	
	public float compoundInterestCalc(int PrincipleAmount,int RateofInterest,int Time,int NumberofTimesCompounded)
		{
		Logger.info("Compound Interest Calculation ");
if(PrincipleAmount<=0)
{
	Logger.error("Amount value either 0 or negitive");
}
		CompoundInterest= PrincipleAmount*(float)(Math.pow(1+((RateofInterest/100)/NumberofTimesCompounded)/100,NumberofTimesCompounded*Time));
		Logger.info("Total amount: "+CompoundInterest);
		return CompoundInterest;
		}
	
	
	
}
