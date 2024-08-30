package com.sourav.mapping.one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AnswersEntity {

	@Id
	private int answer_id;

	private String answer;

	@OneToOne
	private QuestionsEntity questionsEntity;

	public QuestionsEntity getQuestionsEntity() {
		return questionsEntity;
	}

	public void setQuestionsEntity(QuestionsEntity questionsEntity) {
		this.questionsEntity = questionsEntity;
	}

	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
