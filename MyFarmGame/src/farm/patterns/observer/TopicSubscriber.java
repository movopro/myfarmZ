package fmi;

public class TopicSubscriber implements Observer {

	private String name;
	private Subject topic;
	
	public TopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		String message = (String) this.topic.getUpdate(this);
		
		System.out.println("Observer: " + this.name + " has been updated." 
		+ "Message:" + message);
	}

	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;
	}

}
