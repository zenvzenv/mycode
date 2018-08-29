package cn.zw.server.demo1;

public class Response {
	private static String CRLF="\r\n";
	private static String BLANK=" ";
	private static StringBuilder headInfo;
	
	private Response(){
		headInfo =new StringBuilder();
	}
	
	public void createHeadInfo(int code){
		//1.HTTPЭ��汾��״̬���롢����
		headInfo.append("HTTP/1.1").append(BLANK).append(code).append(BLANK);
		
	}
}
