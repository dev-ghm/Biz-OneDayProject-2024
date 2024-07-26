package com.callor.memo.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.memo.models.MemoVO;



public interface MemoDao {
	
	@Select("SELECT * FROM tbl_memo")
	public List<MemoVO> selectAll();	

	public int insert(MemoVO memoVO);
	

}
