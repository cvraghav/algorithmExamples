import java.util.Arrays;
class Doors{

	public Boolean[] findOpenDoors(Boolean[] doors){
                for(int i=0; i< doors.length; i++){
			if(doors[i] == null)
				doors[i] = false;
			else
                        	doors[i] = !doors[i];
                }
                
		doors = closeDoor(doors, 1, 2); 
		doors = closeDoor(doors, 2, 3);
                System.out.println("Doors :"+Arrays.toString(doors));
		return doors; 
	}

	public Boolean[] closeDoor(Boolean[] doors, int door, int increment){
		System.out.println(Arrays.toString(doors)+" , "+door);
		if(doors.length-1 < door) return doors;

		doors[door] = !doors[door];
		return closeDoor(doors, (door+increment), increment);
	}

	public static void main(String[] args){
		
		Doors doors = new Doors();
		Boolean[] boolDoors = new Boolean[120];
		boolDoors = doors.findOpenDoors(boolDoors);

		for(int i=0; i< boolDoors.length; i++){
			if(boolDoors[i])
				System.out.print(i+1 +" ");
		}
		
	}

}
