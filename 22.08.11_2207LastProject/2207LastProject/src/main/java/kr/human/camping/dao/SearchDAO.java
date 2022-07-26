package kr.human.camping.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.human.camping.vo.CompanyVO;

@Mapper
public interface SearchDAO {
	// 1. 전체 업체 갯수
	int selectCompanyCount() throws SQLException;
	// 2. 지역코드만 같은 업체 리스트
	List<CompanyVO> searchByareacode(int areacode) throws SQLException;
	// 3. 지역코드, 상세코드가 같은 업체 리스트
	List<CompanyVO> searchBycode(HashMap<String, Integer> map)throws SQLException;
	// 4. 업체 추가
	void insert(CompanyVO companyVO) throws SQLException;
	// 5. 업체 업데이트
	void update(CompanyVO companyVO) throws SQLException;
	// 6. 업체 삭제
	void delete(int idx) throws SQLException;
}
