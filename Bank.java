package Encapsulation;

class Bank {
	private int bId;
	private String bName;
	private String bLocation;

	Bank() {

	}

	Bank(int bId, String bName, String bLocation) {
		this.bId = bId;
		this.bName = bName;
		this.bLocation = bLocation;
	}

	public void display() {
		System.out.println("*****************************************");
		System.out.println("Id      :" + bId);
		System.out.println("Name    :" + bName);
		System.out.println("Address :" + bLocation);
	}

	public int getId() {
		return bId;
	}

	public String getName() {
		return bName;
	}

	public String getLocation() {
		return bLocation;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public void setbLocation(String bLocation) {
		this.bLocation = bLocation;
	}

	@Override
	public String toString() {
		return "Bank [bId=" + bId + ", bName=" + bName + ", bLocation=" + bLocation + "]";
	}

}
