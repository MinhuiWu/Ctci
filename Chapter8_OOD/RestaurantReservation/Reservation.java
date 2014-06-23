import java.util.ArrayList;
import java.util.iterator;


public class Booking extends Reservation{
	private double startTime;
	private Costomer cu;
	private Table table;
	private Hashtable<table, Booking> records;
	private ArrayList<Table> tables;
	
	
	public Booking(Vector<Table> tables){ 
		this.tables = tables;
		records = new Vector<Booking>(); 
	}
	
		
	public Booking(double startTime, Costomer cu, Table table){
		this.startTime = startTime;
		this.cu = cu;
		this.table = table;
	}
	
	
	public Table addTable(double time, Costomer cu){	
		Iterator<Booking> itr = records.iterator();	
		while(itr.hasNext()){}
	}
	
	
	public Table findEmptyTable(double time, Costomer cu){	
		while(records.containsKey(table)){			
		}	
	}
	
	
	public Table removeTable(Table table, Costomer cu){
		
	}
}
