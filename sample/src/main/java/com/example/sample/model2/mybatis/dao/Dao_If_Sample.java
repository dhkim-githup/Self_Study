package com.example.sample.model2.mybatis.dao;

import com.example.sample.model2.vo.Vo_People;
import com.example.sample.model2.vo.Vo_study;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author 
 * Mybatis xml Sample 예제
 * xml - mybatis/mapper/mapper_People.xml
 */
@Mapper
public interface Dao_If_Sample {

		/* String 반환 예제 */
		public String doString(String key_id);

		/* int 반환 예제 */
		public int doInt(int key_id);

		/* Collection 반환 예제 */
		public List<Map<String, String>> doCollection();

		/* Collection 반환 예제 */
		public List<Map<String, String>> doResultMap();

		/* vo 반환 예제 */
		public List<Vo_study> doVo();

		/* pl/sql 반환 예제 */
		public void doCallPlsql(Map<String, String> param) ;
		//public void doCallPlsql2(Map<String, String> param) ;

	   // 전체 리스트 가져오기
		public List<Vo_People> doReadList();

		// 특정 Id 리스트만 가져오기
		public Vo_People doReadId(String id);
		
		// 데이타 로우 생성하기
		public int doCreate(String id, String name, String age);
		
		// 특정 ID 정보 수정하기 
		public int doUpdate(Vo_People vo_People);
		
		// 특정 ID 정보 삭제하기 
		public int doDelete(String id);	
}
