package cn.zw.thread.create;
/**
 * 
 * <p>Title:StaticProxy</p>
 * ��̬���� ���ģʽ
 * 1.��ʵ��ɫ
 * 2.�����ɫ
 * 3.����ʵ����ͬ�ӿ�
 * @author zhengwei
 * @date 2017-5-11 ����1:24:07
 */
public class StaticProxy {
	public static void main(String[] args) {
		You you=new You();
		WebbingCompany wc=new WebbingCompany(you);
		wc.marry();
	}
}
//�ӿ�
interface Marry{
	public abstract void marry();
}
//��ʵ��ɫ
class You implements Marry{
	@Override
	public void marry() {
		System.out.println("�Һ�xx�����");
	}
}
//�����ɫ
class WebbingCompany implements Marry{
	private Marry you;
	public WebbingCompany() {
		super();
	}
	public WebbingCompany(Marry you) {
		super();
		this.you = you;
	}
	private void before(){
		System.out.println("��ʰϸ��");
	}
	private void after(){
		System.out.println("�ֶ���");
	}
	@Override
	public void marry() {
		before();
		you.marry();
		after();
	}
}