

public class Thermometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d,f;
		String c;
		String[] celi= {"1.5C","1.0C","0.5C","0.0C","0.1C","-0.5C","-0.5C","0.0C","0.5C","0.0C","2.0C"};
		String[] fahren= {"33F","35F","31.5F","32.1F","33F","32.0F","32.9F","32.5F","34.1F","31.0F","30.1F","31.9F","31.2F"};
		  for(int i=0;i<celi.length;i++)//length is the property of array  
	        {
	        	if(celi[i].contains("C")==true)
	        	{
	        	c=celi[i].replaceFirst("C", "");
	        	 d=Double.parseDouble(c);
	        		if (d <= .5 && d >= -0.5) {
	        		System.out.println("Celsius temperature reached  threshold point "+d);
	        	
	        		}
	        		else 
	        		{
	        			System.out.println("Celsius temperature crossed  threshold point "+d);
	        		}
	        }
	
	        }
		  
		  for(int i=0;i<fahren.length;i++)//length is the property of array  
	        {
	        	if(fahren[i].contains("F")==true)
	        	{
	        	c=fahren[i].replaceFirst("F", "");
	        	 f=Double.parseDouble(c);
	        		if (f <= 31.1 || f <= 32.9) {
	        		System.out.println("Fahrenheit temperature reached  threshold point "+f);
	        	
	        		}
	        		else 
	        		{
	        			System.out.println("Fahrenheit temperature crossed  threshold point "+f);
	        		}
	        }
	
	        }
		  
		  
	}


}
