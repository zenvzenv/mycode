package cn.zw.io.pattern;
/**
 * 
 * <p>Title:Amplifier</p>
 * <p>Description:扩音器</p>
 * 设计模式就是类与类之间的关系
 * 1.依赖：一个类是另一个类的形参或局部变量
 * 2.关联：一个类是另一个类的属性
 * 		聚合：属性，整体与部分有不一致的生命周期，人与手
 * 		组合：属性，整体与部分有一只的生命周期，人与大脑
 * 3.继承：父类与子类的关系
 * 4.实现：接口与实现类的关系
 * 
 * 
 * @author zhengwei
 * @date 2017-5-10 下午6:09:38
 */
public class Amplifier {
	private Voice voice;

	public Amplifier() {
		super();
	}

	public Amplifier(Voice voice) {
		super();
		this.voice = voice;
	}

	public Voice getVoice() {
		return voice;
	}

	public void setVoice(Voice voice) {
		this.voice = voice;
	}
	public void bigVoice(Voice voice){
		System.out.println(voice.getVoice()*1000);
	}
}
