package org.studyeasy.cars;

public class PetrolCar implements Machine{

	/* (non-Javadoc)
	 * @see org.studyeasy.cars.Machine#run()
	 */
	@Override
	public void run(){
		System.out.println("running petrol car");	
	}

	/* (non-Javadoc)
	 * @see org.studyeasy.cars.Machine#run(int)
	 */
	@Override
	public void run(int speed){
		System.out.println("running at: "+speed+"km/hr");	
	}
	
	/* (non-Javadoc)
	 * @see org.studyeasy.cars.Machine#run(int, int)
	 */
	@Override
	public void run(int speed, int kms){
		System.out.println("running at: "+speed + " for "+kms+ " KM");	
	}
	
	/* (non-Javadoc)
	 * @see org.studyeasy.cars.Machine#run(java.lang.String)
	 */
	@Override
	public String run(String msg){
		System.out.println(msg);
			return msg;
	}
	
	/* (non-Javadoc)
	 * @see org.studyeasy.cars.Machine#run(int, java.lang.String)
	 */
	@Override
	public String run(int id,String msg){
		System.out.println(id+msg);
			return msg;
	}
	/* (non-Javadoc)
	 * @see org.studyeasy.cars.Machine#run(int, java.lang.String, java.lang.String)
	 */
	@Override
	public String run(int id,String msg,String msg2){
		System.out.println(id+msg);
			return msg;
	}
	
}
