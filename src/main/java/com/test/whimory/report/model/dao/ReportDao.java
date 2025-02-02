package com.test.whimory.report.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.whimory.common.Paging;
import com.test.whimory.common.SearchDate;
import com.test.whimory.report.model.vo.Report;
import com.test.whimory.report.model.vo.ReportLike;

@Repository("reportDao")
public class ReportDao {

	@Autowired
	SqlSessionTemplate sqlSession;

	public ArrayList<Report> selectList(Paging page) {
		List<Report> list = sqlSession.selectList("reportMapper.selectList", page);
		return (ArrayList<Report>) list;
	}

	public int selectListCount() {
		return sqlSession.selectOne("reportMapper.selectListCount");
	}

	public Report selectOne(int report_no) {
		return sqlSession.selectOne("reportMapper.selectOne", report_no);
	}

	public int selectReportLike(ReportLike rplike) {
		return sqlSession.selectOne("reportMapper.selectReportLike", rplike);
	}

	public int updateAddReadCount(int report_no) {
		return sqlSession.update("reportMapper.updateAddReadCount", report_no);
	}

	public int insertAddLikeCount(ReportLike rplike) {
		return sqlSession.insert("reportMapper.insertAddLikeCount", rplike);
	}

	public int updateAddLikeCount(int report_no) {
		return sqlSession.update("reportMapper.updateAddLikeCount", report_no);
	}

	public int insertReport(Report report) {
		return sqlSession.insert("reportMapper.insertReport", report);
	}

	public int updateReport(Report report) {
		return sqlSession.update("reportMapper.updateReport", report);
	}

	public int deleteReport(int report_no) {
		return sqlSession.delete("reportMapper.deleteReport", report_no);
	}

	public int updateComment(Report comment) {
		return sqlSession.update("reportMapper.updateComment", comment);
	}

	public int deleteComment(int report_no) {
		return sqlSession.update("reportMapper.deleteComment", report_no);
	}

	public ArrayList<Report> selectSearchTitle(Paging paging) {
		List<Report> list = sqlSession.selectList("reportMapper.selectSearchTitle", paging);
		return (ArrayList<Report>) list;
	}

	public ArrayList<Report> selectSearchWriter(Paging paging) {
		List<Report> list = sqlSession.selectList("reportMapper.selectSearchWriter", paging);
		return (ArrayList<Report>) list;
	}

	public ArrayList<Report> selectSearchDate(Paging paging) {
		List<Report> list = sqlSession.selectList("reportMapper.selectSearchDate", paging);
		return (ArrayList<Report>) list;
	}

	// 현주 추가 부분 - 회원 : 나의 제보 내역
	public ArrayList<Report> selectListU(Paging page) {
		List<Report> list = sqlSession.selectList("reportMapper.selectListU", page);
		return (ArrayList<Report>) list;
	}

	// 현주 추가 부분 - 관리자가 반영했는지 확인을 위한 부분
	public ArrayList<Report> selectListA(Paging page) {
		List<Report> list = sqlSession.selectList("reportMapper.selectListA", page);
		return (ArrayList<Report>) list;
	}

	public int selectSearchTitleCount(String keyword) {
		return sqlSession.selectOne("reportMapper.selectSearchTitleCount", keyword);
	}

	public int selectSearchWriterCount(String keyword) {
		return sqlSession.selectOne("reportMapper.selectSearchWriterCount", keyword);
	}

	public int selectSearchDateCount(Paging paging) {
		return sqlSession.selectOne("reportMapper.selectSearchDateCount", paging);
	}

	//받아오기
	public int selectListCountU(String user_id) {
		return sqlSession.selectOne("reportMapper.selectListCountU", user_id);
	}
}
