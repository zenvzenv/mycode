package code3月27;

public class Point {
	double x,y,z;
	//通过构造方法初始化对象的属性和构造该类的对象
	public Point(double _x,double _y,double _z){//构造方法
		x=_x;
		y=_y;
		z=_z;
	}
	public void setX(double _x){
		x=_x;
	}
	public void setY(double _y){
		y=_y;
	}
	public void setZ(double _z){
		z=_z;
	}
	public double distance(Point p){
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)+(z-p.z));
	}
	public static void main(String[] args) {
		Point p=new Point(12, 23, 45);
		Point p1=new Point(10, 11, 12);
		p.setX(10);
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.z);
		double distance=p1.distance(p);
		System.out.println(distance);
	}
}
