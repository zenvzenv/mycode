package cn.zw.sort.refType;
/**
 * 
 * <p>Title:Goods</p>
 * <p>Description:很干净的实体类</p>
 * @author zhengwei
 * @date 2017-5-5 上午11:49:29
 */
public class Goods {
	//商品名称
	private String name;
	//价格
	private double price;
	//收藏量
	private int fav;
	@Override
	public String toString() {
		return "商品名"+name+",收藏量"+this.price+",价格"+this.fav+"\n";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getFav() {
		return fav;
	}
	public void setFav(int fav) {
		this.fav = fav;
	}
	public Goods(String name, double price, int fav) {
		super();
		this.name = name;
		this.price = price;
		this.fav = fav;
	}
	public Goods() {
		super();
	}
	
}
