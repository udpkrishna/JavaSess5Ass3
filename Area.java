package Basic;

public class Area {
int len;
int bre;
int side;
double sqrarea, recarea;

Area(){
	len=bre=side=0;
}

Area(int s){
	side=s;
	sqrarea=s*s;
	System.out.println("Area of square is "+ sqrarea);	
}

Area(int l, int b){
	len=l;
	bre=b;
	recarea=b*l;
	System.out.println("Area of rectangle is"+ recarea);
}

public int getLen() {
	return len;
}

public void setLen(int len) {
	this.len = len;
}

public int getBre() {
	return bre;
}

public void setBre(int bre) {
	this.bre = bre;
}

public int getSide() {
	return side;
}

public void setSide(int side) {
	this.side = side;
}


}
