public class TrainTicket{

	int pnr;
	String trainName;
	String from;
	String destination;
	int price;

	public TrainTicket(){
		System.out.println(" No Param Contructor");
	}

	public TrainTicket(int pnr){
		this();
		this.pnr = pnr;
	}

	public TrainTicket(int pnr, String trainName){
		this(pnr);
		this.trainName = trainName;
	}	

	public TrainTicket(int pnr, String trainName, String from){
		this(pnr, trainName);
		this.from = from;
	}	

	public TrainTicket(int pnr, String trainName, String from, String destination){
		this(pnr, trainName, from);
		this.destination = destination;
	}	

	public TrainTicket(int pnr, String trainName, String from, String destination, int price){
		this(pnr, trainName, from, destination);
		this.price = price;
	}	

	public void printDetails(){
		System.out.println(pnr);
		System.out.println(trainName);
		System.out.println(from);
		System.out.println(destination);
		System.out.println(price);
	}
}