import java.util.Stack;

public class Tower{
	/* hanoi tower
	 * consider the 3 plates situation, first two in the buffer, last one in the destination 
	 * then all the n plates/disks, put n-1 in the buffer, last one in the destination,
	 * then as before, move all n-1 disks to the destination
		
	 * For n disks, we need 2^n-1 steps at minimum to finish the game	
	 */
		
		//private Stack<Integer> towerDest;
		//private Stack<Integer> towerBuffer;
		Tower[] towers = new Tower[3];
		Stack towerOrigin;
		
		
		Stack<Integer> tower;
		public Tower(){
			tower = new Stack<Integer>();
			//this.size = size;
		}
		

		public void move(int n, Tower towerDest, Tower towerBuffer){
			if(n>0){
				move(n-1, towerBuffer, towerDest);
				int value = towerOrigin.pop();
				towerDest.add(value);
				move(n-1, towerDest, towerOrigin);
			}
		}
		
		
		public void add(int value) {
			if (!tower.isEmpty() && tower.peek() <= value) {
				System.out.println("Error placing disk " + value);
			} else {
				tower.push(value);
			}
		}
		
		

		
		/**
		public static void main(String[] str){
			int n = 5;
			Tower[] towers = new Tower[3];
			for(int i = 0; i<3; i++){	
				towers[i] = new Tower(i);
			}
			for(int i = n; i>0; i--){
				towers[0].push(i);
			}
			towers[0].move(n, towers[2], towers[1]);
		} 
		*/	

}
