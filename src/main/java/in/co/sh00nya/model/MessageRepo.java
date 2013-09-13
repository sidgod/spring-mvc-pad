package in.co.sh00nya.model;

import java.util.ArrayList;
import java.util.List;

public class MessageRepo {
	
	private List<String> msgList = new ArrayList<String>();

	public List<String> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<String> msgList) {
		this.msgList = msgList;
	}

}
