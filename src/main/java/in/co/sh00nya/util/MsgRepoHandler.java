package in.co.sh00nya.util;

import java.util.ArrayList;
import java.util.List;

import in.co.sh00nya.model.MessageRepo;

public class MsgRepoHandler {
	
	private static MessageRepo repo = new MessageRepo();
	
	public void addMessage(String msg) {
		repo.getMsgList().add(msg);
	}
	
	public List<String> getMsgList() {
		List<String> msgList = new ArrayList<String>();
		msgList.addAll(repo.getMsgList());
		return msgList;
	}
	
}
