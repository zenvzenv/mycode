package cn.zw.io.pattern;

public class Voice {
	private int voice=30;

	public int getVoice() {
		return voice;
	}

	public void setVoice(int voice) {
		this.voice = voice;
	}

	public Voice(int voice) {
		super();
		this.voice = voice;
	}

	public Voice() {
		super();
	}
	public void say(){
		System.out.println(voice);
	}
}
