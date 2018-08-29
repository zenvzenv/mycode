package cn.zw.thread.create;
/**
 * 
 * <p>Title:StaticProxy</p>
 * 静态代理 设计模式
 * 1.真实角色
 * 2.代理角色
 * 3.两者实现相同接口
 * @author zhengwei
 * @date 2017-5-11 下午1:24:07
 */
public class StaticProxy {
	public static void main(String[] args) {
		You you=new You();
		WebbingCompany wc=new WebbingCompany(you);
		wc.marry();
	}
}
//接口
interface Marry{
	public abstract void marry();
}
//真实角色
class You implements Marry{
	@Override
	public void marry() {
		System.out.println("我和xx结婚了");
	}
}
//代理角色
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
		System.out.println("收拾细软");
	}
	private void after(){
		System.out.println("闹洞房");
	}
	@Override
	public void marry() {
		before();
		you.marry();
		after();
	}
}