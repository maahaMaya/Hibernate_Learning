package com.sourav.mapping.one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnswersEntity {

	@Id
	private int answer_id;

	private String answer;


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
