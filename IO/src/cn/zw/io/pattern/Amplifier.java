package cn.zw.io.pattern;
/**
 * 
 * <p>Title:Amplifier</p>
 * <p>Description:������</p>
 * ���ģʽ����������֮��Ĺ�ϵ
 * 1.������һ��������һ������βλ�ֲ�����
 * 2.������һ��������һ���������
 * 		�ۺϣ����ԣ������벿���в�һ�µ��������ڣ�������
 * 		��ϣ����ԣ������벿����һֻ���������ڣ��������
 * 3.�̳У�����������Ĺ�ϵ
 * 4.ʵ�֣��ӿ���ʵ����Ĺ�ϵ
 * 
 * 
 * @author zhengwei
 * @date 2017-5-10 ����6:09:38
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
