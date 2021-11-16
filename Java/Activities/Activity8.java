package activities;


class CustomException extends Exception
{
private String message=null;
public CustomException(String msg)
	{
	 message=msg;
	}

@Override
public String getMessage() {
    return message;
}

}
public class Activity8 {
	public static void main(String[] args)
	{
	  Activity8 obj=new Activity8();
	  try {
		obj.exceptionTest(null);
	} catch (CustomException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void exceptionTest(String s) throws CustomException {
        if(s == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(s);
        }

}
}
