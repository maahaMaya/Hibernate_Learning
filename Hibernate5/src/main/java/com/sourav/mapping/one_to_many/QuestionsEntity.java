package com.sourav.mapping.one_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class QuestionsEntity {

	@Id
	private int question_id;

	private String question;

	@OneToMany
	private List<AnswersEntity> listAnswersEntity;

	public QuestionsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public QuestionsEntity(int question_id, String question, List<AnswersEntity> listAnswersEntity) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.listAnswersEntity = listAnswersEntity;
	}



	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<AnswersEntity> getListAnswersEntity() {
		return listAnswersEntity;
	}

	public void setListAnswersEntity(List<AnswersEntity> listAnswersEntity) {
		this.listAnswersEntity = listAnswersEntity;
	}

}
