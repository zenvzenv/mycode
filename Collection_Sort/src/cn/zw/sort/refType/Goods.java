package cn.zw.sort.refType;
/**
 * 
 * <p>Title:Goods</p>
 * <p>Description:�ܸɾ���ʵ����</p>
 * @author zhengwei
 * @date 2017-5-5 ����11:49:29
 */
public class Goods {
	//��Ʒ����
	private String name;
	//�۸�
	private double price;
	//�ղ���
	private int fav;
	@Override
	public String toString() {
		return "��Ʒ��"+name+",�ղ���"+this.price+",�۸�"+this.fav+"\n";
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
