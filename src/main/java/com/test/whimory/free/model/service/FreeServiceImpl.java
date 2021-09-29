package com.test.whimory.free.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.whimory.common.Paging;
import com.test.whimory.free.model.dao.FreeDao;
import com.test.whimory.free.model.vo.Free;
import com.test.whimory.free.model.vo.FreeBad;
import com.test.whimory.free.model.vo.FreeLike;
import com.test.whimory.free.model.vo.FreeReply;
import com.test.whimory.notice.model.vo.Notice;

@Service("FreeService")
public class FreeServiceImpl implements FreeService {

	@Autowired
	FreeDao freeDao;
	
	@Override
	public ArrayList<Free> selectList(Paging page) {
		return freeDao.selectList(page);
	}

	@Override
	public int selectListCount() {
		return freeDao.selectListCount();
	}

	@Override
	public Free selectOne(int free_no) {
		return freeDao.selectOne(free_no);
	}

	@Override
	public ArrayList<Free> selectSearchTitle(Paging paging) {
		List<Free> list = freeDao.selectSearchTitle(paging);
		return (ArrayList<Free>)list;
	}

	@Override
	public ArrayList<Free> selectSearchWriter(Paging paging) {
		List<Free> list = freeDao.selectSearchWriter(paging);
		return (ArrayList<Free>)list;
	}

	@Override
	public ArrayList<Free> selectSearchContent(Paging paging) {
		List<Free> list = freeDao.selectSearchContent(paging);
		return (ArrayList<Free>)list;
	}

	@Override
	public ArrayList<FreeReply> selectReplyList(int free_no) {
		return freeDao.selectReplyList(free_no);
	}

	@Override
	public int insertOrigin(Free free) {
		return freeDao.insertOrigin(free);
	}

	@Override
	public int insertReply(FreeReply freply) {
		return freeDao.insertReply(freply);
	}

	@Override
	public int updateOrigin(Free free) {
		return freeDao.updateOrigin(free);
	}

	@Override
	public int deleteOrigin(int free_no) {
		return freeDao.deleteOrigin(free_no);
	}

	@Override
	public int deleteReply(int free_reply_no) {
		return freeDao.deleteReply(free_reply_no);
	}

	@Override
	public int updateAddReadCount(int free_no) {
		return freeDao.updateAddReadCount(free_no);
	}

	@Override
	public int selectLikeYN(FreeLike flike) {
		return freeDao.selectLikeYN(flike);
	}

	@Override
	public int selectBadYN(FreeBad fbad) {
		return freeDao.selectBadYN(fbad);
	}

	@Override
	public int selectLikeCount(FreeLike flike) {
		return freeDao.selectLikeCount(flike);
	}

	@Override
	public int selectBadCount(FreeBad fbad) {
		return freeDao.selectBadCount(fbad);
	}

	@Override
	public int insertAddLikeCount(FreeLike flike) {
		return freeDao.insertAddLikeCount(flike);
	}

	@Override
	public int insertAddBadCount(FreeBad fbad) {
		return freeDao.insertAddBadCount(fbad);
	}

	@Override
	public int updateAddLikeCount(int free_no) {
		return freeDao.updateAddLikeCount(free_no);
	}

	@Override
	public int updateAddBadCount(int free_no) {
		return freeDao.updateAddBadCount(free_no);
	}

	@Override
	public ArrayList<Free> selectFreeTop5() {
		return freeDao.selectFreeTop5();
	}

	@Override
	public int selectSearchTitleCount(String keyword) {
		return freeDao.selectSearchTitleCount(keyword);
	}

	@Override
	public int selectSearchWriterCount(String keyword) {
		return freeDao.selectSearchWriterCount(keyword);
	}

	@Override
	public int selectSearchContentCount(String keyword) {
		return freeDao.selectSearchContentCount(keyword);
	}
	
}
