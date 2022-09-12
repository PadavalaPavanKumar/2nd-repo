package CollectionFramework;

public class mapProperties {
	public static void main(String[] args) {
		int number = 8;
		try {
			if (number < 2 || number > 99) {
				System.out.println("wrong input");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	} 
}
