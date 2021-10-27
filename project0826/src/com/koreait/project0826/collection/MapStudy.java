package com.koreait.project0826.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//컬렉션 프레임웍이 지원하는 객체 중 key-value의 쌍으로 구성된 집합을 제어하는 Map계열을 학습한다.
//
public class MapStudy {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("name1","Smith");
		map.put("name2","Scott");
		map.put("name3","King");
		
		System.out.println(map.get("name1"));
		Set<String> keySet = map.keySet();//명단만 끄집어 내서 Set에 담는다.
		Iterator<String> it = keySet.iterator();//명단을 일렬로 늘어뜨림..
		
		
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
		//
	}
}
