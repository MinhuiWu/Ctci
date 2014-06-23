public class Restaurant{
	private Booking records; 
	private ArrayList<Table> tables; 
	private double timeGap;
	
	
	public Restaurant(){
	// initilize timeGap
		tables = new ArrayList<Table>(); // add details to tables
		records = new Booking(tables);
	}
	
	
	public boolean findEmptyTable(double time, Customer numOfPeople){ 
		if (records.findEmptyTable(time, numOfPeople)!=null){
			return true;
		} else {
			return false;
		}
	}
	
	
	public Table reserve(double time, Customer cu) { 
		return records.add(time, cu);
	}
	
	
	public void cancelReserve(double time, Table reservedTable) { 
		records.remove(time, reservedTable);
	}
		
}
