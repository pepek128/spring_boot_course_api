package com.patryk.application.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("jax", "Jax", "Builds and tips for Jax"),
			new Topic("irelia", "Irelia", "Builds and tips for Irelia"),
			new Topic("katarina", "Katarina", "Builds and tips for Katarina"),
			new Topic("zed", "Zed", "Builds and tips for Zed"),
			new Topic("caitlyn", "Caitlyn", "Builds and tips for Caitlyn")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
