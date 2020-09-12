package fmi;

public class ObserverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Topic myTopic = new Topic();
		
		TopicSubscriber obs1 = new TopicSubscriber("Obs_1");
		TopicSubscriber obs2 = new TopicSubscriber("Obs_2");
		TopicSubscriber obs3 = new TopicSubscriber("Obs_3");
		
		myTopic.register(obs1);
		myTopic.register(obs2);
		myTopic.register(obs3);
		
		myTopic.postMessage("It's a new day");

	}

}
