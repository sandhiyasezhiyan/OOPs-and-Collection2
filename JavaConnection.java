package OOPSAssignment4;

public class JavaConnection implements DatabaseConnection{

	public void connect() {
		
		System.out.println("database connected");
	}

	public void disconnect() {
		
		System.out.println("disconnected");
	}

	public void executeupdate() {
	
		System.out.println("update executed");
	}
	
	
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeupdate();
	}

}
