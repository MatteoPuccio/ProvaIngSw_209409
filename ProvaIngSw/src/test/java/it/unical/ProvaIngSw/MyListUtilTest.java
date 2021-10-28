package it.unical.ProvaIngSw;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MyListUtilTest {
	
	public MyListUtilTest() {
		
	}
	
	@Parameterized.Parameters
	public static List<Integer> getParameters() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(1);
		return list;
	}
	@Test
	public void sortTest() {
		DateTime time = new DateTime();
		System.out.println(time);
		//test sort ascendente
		MyListUtil.sort(getParameters(), 0);
		//test sort discendente
		MyListUtil.sort(getParameters(), 1);
		MyListUtil.sort(getParameters(), 2);
		time = DateTime.now();
		System.out.println(time);
	}
	@BeforeClass
	public static void beforeClass() {
		DateTime time = new DateTime();
		System.out.println(time);
		MyListUtil myListUtil = new MyListUtil();
		time = DateTime.now();
		System.out.println(time);
	}
}

