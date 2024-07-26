package com.callor.memo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemoVO {

	private int m_seq;
	private String m_author;
	private String m_date;
	private String m_time;
	private String m_memo;
	private String m_image;
}
