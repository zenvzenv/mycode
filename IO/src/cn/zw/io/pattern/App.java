package cn.zw.io.pattern;

public class App {
	public static void main(String[] args) {
		Voice v=new Voice();
		v.say();
		Amplifier am=new Amplifier();
		am.bigVoice(v);
	}
}
