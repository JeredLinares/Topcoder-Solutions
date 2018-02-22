
public class FlightDataRecorder{
	public double getDistance(int[] deg, int[] dist){
		int numPoints = deg.length;
		double x = 0.0;
		double y = 0.0;
		for(int i = 0 ; i < numPoints ; i++){
			x += (double)dist[i]*Math.sin((double)deg[i]*Math.PI/180.0);
			y += (double)dist[i]*Math.cos((double)deg[i]*Math.PI/180.0);
		}
		return Math.sqrt(x*x+y*y);

	}	

}
