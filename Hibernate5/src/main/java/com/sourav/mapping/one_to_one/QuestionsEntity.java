package com.sourav.mapping.one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class QuestionsEntity {

	@Id
	private int question_id;

	private String question;

	@OneToOne
	private AnswersEntity answersEntity;

	public QuestionsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionsEntity(int question_id, String question, AnswersEntity answersEntity) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answersEntity = answersEntity;
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

	public AnswersEntity getAnswersEntity() {
		return answersEntity;
	}

	public void setAnswersEntity(AnswersEntity answersEntity) {
		this.answersEntity = answersEntity;
	}

}
