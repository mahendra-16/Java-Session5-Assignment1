package Session5;

public interface SampleInterface {

	void message(int num);
	
}

class Juno implements SampleInterface{

	@Override
	public void message(int num) {
		// TODO Auto-generated method stub
		System.out.println("The value is : " + num);
	}
	
	
}

class Mars implements SampleInterface{

	@Override
	public void message(int num) {
		// TODO Auto-generated method stub
		System.out.println("The Square of num is : " + num*num);
	}
	
	
}