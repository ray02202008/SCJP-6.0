//Exam 094
public class Rainbow {
	public enum MyColor{
		RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);
		private final int rgb;
		MyColor(int rgb){this.rgb = rgb;}
		public int getRGB(){return rgb;}
	}
	public static void main(String[] args) {
		//MyColor skyColor = Blue;
		//MyColor treeColor = MyColor.GREEN;
		//if(RED.getRGB() < BLUE.getRGB()){}
		//MyColor purple = new MyColor(0xff00ff);
		//MyColor purple = MyColor.BLUE + MyColor.GREEN;
	}
}
