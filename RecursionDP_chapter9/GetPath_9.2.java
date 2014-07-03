import java.util.Hashtable;

public class GetPath{
	/* Robot go from (0,0) to (x,y) only two direction is allowed, right and down
	 * assumption: assume that this maze is a 2D array, which if the array point is 0, the robot is not allowed to go through
	 *	
	 * bottom up thinking: only go (x-1, y), (x, y-1) for the last step, use recursion	
	 * DP solution: avoid count duplicate path, put them in the cache		 
	 */	
		
	//recursion	solution
	public static int[][] maze = new int[10][10];
	
	public boolean isFree(int x, int y) {
		if (maze[x][y] == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	
	public boolean getPathHelper(int x, int y, ArrayList<Point> path) {
		Point point = new Point(x, y);
		path.add(point);
		boolean getPath = false;
		
		if (x < 0 || y < 0 || !isFree(x, y)) {
			return false;
		}
		
		if (x == 0 && y == 0) {
			return path;//find a path
		}
				
		if (x >= 1 && isFree(x - 1, y)) {
			getPathHelper = getPathHelper(x - 1, y, path);
		}
		
		if (y >= 1 && isFree(x, y - 1)) {
			getPathHelper = getPathHelper(x, y - 1, path);
		}
		
		if (getPath){
			path.add(point);
		}
		
		return getPath;
	}
	
	
	public boolean getPath(int x, int y) {
		ArrayList<Point> path = new ArrayList<Point>();
		return getPathHelper(x, y, path);
	}	
	
	public point(int x, int y){
		
	}
	
	
	
	
	//DP solution
	public boolean getPathDP(int x, int y, ArrayList<Point> path){
		
	}
	
	public boolean getPathDPHelper(int x, int y, ArrayList<Point> path, Hashtable<point, boolean> cache) {
		Point point = new Point(x, y);
		boolean getPath = false;
		
		if (x < 0 || y < 0 || !isFree(x, y)) {
			return false;
		}
		
		if (x == 0 && y == 0) {
			return path;//find a path
		}
		
		if (cache.containsKey(point)) {
			return cache.get(point);//already exist point in cache
		}
		
		if (x >= 1 && isFree(x - 1, y)) {
			getPathDPHelper = getPathHelper(x - 1, y, path, cache);
		}
		
		if (y >= 1 && isFree(x, y - 1)) {
			getPathDPHelper = getPathHelper(x, y - 1, path, cache);
		}
		
		if (getPath) {
			path.add(point);
		}
		
		cache.put(point, getPath);
		return getPath;
	}
	
		
	
}
