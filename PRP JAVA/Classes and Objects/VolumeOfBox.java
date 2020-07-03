
public class VolumeOfBox
{
private int width;
private int height;
private int depth;
public VolumeOfBox(int width, int height, int depth) {
	super();
	this.width = width;
	this.height = height;
	this.depth = depth;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getDepth() {
	return depth;
}
public void setDepth(int depth) {
	this.depth = depth;
}
public int getVolume()
{
	return width*height*depth;
}
public static void main(String args[])
{
	VolumeOfBox b=new VolumeOfBox(2,3,4);
	System.out.println(b.getVolume());
}
}
