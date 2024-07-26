package com.callor.memo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.memo.models.MemoVO;
import com.callor.memo.persistance.MemoDao;
import com.callor.memo.service.MemoService;

@Service
public class MemoServiceImplV1 implements MemoService {
	
	protected final MemoDao memoDao;
	
	
	public MemoServiceImplV1(MemoDao memoDao) {
		super();
		this.memoDao = memoDao;
	}



	@Override
	public List<MemoVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
