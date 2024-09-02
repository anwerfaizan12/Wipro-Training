package day_08;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.*;




class Mesaage implements java.io.Serializable{
	
private String senderName;
private String receiverName;
private LocalDateTime time;
private String content;

public void Message(String senderName, String receiverName, LocalDateTime time,String content) {
	 this.senderName = senderName;
	 this.receiverName = receiverName;
	 this.time = time;
	 this.content = content;
}

public String getSenderName() {
	return senderName;
}

public void setSenderName(String senderName) {
	this.senderName= senderName;
}

public String getReceiverName() {
	return receiverName;
}

public void setReceiverName(String receiverName) {
 this.receiverName = receiverName;
}

public LocalDateTime getTime() {
	return time;
}

/*public void setTime(LocalDateTime time) {
	this.time = time;
}
*/

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public String toString() {
	return "From "+senderName + " to "+receiverName +" at "+time+" Message = "+content;
}
}



public class Prg_01 {
 public static void main(String[] args) {
	 List<Message> msg = new ArrayList<>();
	 
	 msg.add(new Message("Aleena","Mariya",LocalDateTime.now(),"How are you!"));
	 msg.add(new Message("Sameera","Mariya",LocalDateTime.now(),"What are you doing!"));
	 msg.add(new Message("Iqra","Aleena",LocalDateTime.now(),"Excellent!"));
	 msg.add(new Message("Pooja","Mariya",LocalDateTime.now(),"Live in Delhi!"));
	 msg.add(new Message("Aleena","Divya",LocalDateTime.now(),"What to do!"));
	 
	 try(FileOutputStream file = new FileOutputStream("C:\\Users\\Administrator\\eclipse-workspace\\faizan_anwer");
			 ObjectOutputStream obj = new ObjectOutputStream(file)){
			 obj.writeObject(msg);
			 System.out.println("Serialization is done now");
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			 
	 
 }
}
