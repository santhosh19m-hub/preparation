package conditions;

public class Direction {

	public static void main(String[] args) {
		String dir="west";
		switch(dir) {
		case "south":System.out.println("It points South direction");
		break;
		case "north":System.out.println("It points North direction");
		break;
		case "east":System.out.println("It points East direction");
		break;
		case "west":System.out.println("It points West direction");
		break;
		default:System.out.println("Not a direction");
		break;
		
		}

	}

}
