package kr.human.camping.dao;

import java.sql.SQLException;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import kr.human.camping.vo.TestVO;

@Mapper
public interface TestDAO {
	String today() throws SQLException;
	int    sum(HashMap<String, Integer> map) throws SQLException;
	int    mul(HashMap<String, Integer> map) throws SQLException;
	TestVO vo(TestVO testVO) throws SQLException;
}
