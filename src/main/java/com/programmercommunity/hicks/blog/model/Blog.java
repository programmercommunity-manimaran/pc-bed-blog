package com.programmercommunity.hicks.blog.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("blog")
public class Blog {
	@Id
	public String id;
	public String title;
	public String subtitle;
	public String authorId; // user id
	public List<String> images;
	public List<String> contents;
	public long views;
	public long likes;
	public long commentCount; // no of comments
	public String addedDate;
	public String lastActiveDate;
	public List<String> hashtags;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public List<String> getImages() {
		return this.images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public List<String> getContents() {
		return this.contents;
	}

	public void setContents(List<String> contents) {
		this.contents = contents;
	}

	public long getViews() {
		return this.views;
	}

	public void setViews(long views) {
		this.views = views;
	}

	public long getLikes() {
		return this.likes;
	}

	public void setLikes(long likes) {
		this.likes = likes;
	}

	public long getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(long commentCount) {
		this.commentCount = commentCount;
	}

	public String getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}

	public String getLastActiveDate() {
		return this.lastActiveDate;
	}

	public void setLastActiveDate(String lastActiveDate) {
		this.lastActiveDate = lastActiveDate;
	}

	public List<String> getHashtags() {
		return this.hashtags;
	}

	public void setHashtags(List<String> hashtags) {
		this.hashtags = hashtags;
	}

	public Blog(String id, String title, String subtitle, String authorId, List<String> images, List<String> contents,
			long views, long likes, long commentCount, String addedDate, String lastActiveDate, List<String> hashtags) {
		super();
		this.id = id;
		this.title = title;
		this.subtitle = subtitle;
		this.authorId = authorId;
		this.images = images;
		this.contents = contents;
		this.views = views;
		this.likes = likes;
		this.commentCount = commentCount;
		this.addedDate = addedDate;
		this.lastActiveDate = lastActiveDate;
		this.hashtags = hashtags;
	}

	public Blog() {
		super();
	}

}
