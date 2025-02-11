package firework.hyl.running.service;

import java.util.List;

import firework.hyl.running.common.bean.Memberinfo;
import firework.hyl.running.common.bean.Messagerecord;
import firework.hyl.running.common.exception.MessengerServiceException;

public interface IMessengerService {
	// 通过名字查找新邮件个数
	Integer findNewMessageNum(String nickname) throws MessengerServiceException;
	
	// 查找一个用户
	Memberinfo findOneMemberinfo() throws MessengerServiceException;
	
	// 通过年龄，性别，城市查找好友
	List<Memberinfo> findFriends(String age, String gender, String city) throws MessengerServiceException;
	
	// 保存短信
	void saveMessage(Messagerecord message) throws MessengerServiceException;
	
	// 发件箱
	List<Messagerecord> listSendMessage(String senderName) throws MessengerServiceException;
	
	// 收件箱
	List<Messagerecord> listRecieveMessage(String recieveName) throws MessengerServiceException;
	
	// 通过ID查找短信
	Messagerecord findMessage(Long id) throws MessengerServiceException;
	
	// 通过ID删除收到短息
	void delRecieveMessage(Long id) throws MessengerServiceException;
	
	// 通过ID删除收到短息 删除多个
	void delRecieveMessage(Long[] id) throws MessengerServiceException;
	
	// 通过ID删除发送短息
	void delSendMessage(Long id) throws MessengerServiceException;
	
	// 通过ID删除发送短息 删除多个
	void delSendMessage(Long[] id) throws MessengerServiceException;
}
