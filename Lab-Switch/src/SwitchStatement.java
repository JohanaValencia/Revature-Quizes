
public class SwitchStatement {
	public static void main(String[]args) {
		//int x = 10;
		int x = 5;
		/*switch(x) {
		case 10:System.out.println("case 10 ran");
		default:System.out.println("The default case ran.");
		}*/
		/*switch(x) {
		case 6:System.out.println("case 6 ran");
		default:System.out.println("The default case ran.");
		case 7:System.out.println("case 7 ran");
		case 10:System.out.println("case 10 ran");

		}*/
		/*switch(x) {
		case 6:System.out.println("case 6 ran");
		break;
		default:System.out.println("The default case ran.");
		break;
		case 7:System.out.println("case 7 ran");
		break;
		case 10:System.out.println("case 10 ran");

		}*/
		switch(x) {
		case 6:{
			System.out.println("case 6 ran");
		break;}
		default:
			{System.out.println("The default case ran.");
		break;}
		case 7:
			{System.out.println("case 7 ran");
		break;}
		case 10:
			{System.out.println("case 10 ran");
				}
			}
		}
	}
