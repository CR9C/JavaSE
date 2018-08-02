package io.github.cr9c.day01.junit;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class UserDAOTest {
	@Before
	public void init() {
		System.out.println("UserDAOTest.init()");
	}
	//只支持执行Test
	@Test
	public void save() {
		System.out.println("UserDAOTest.save()");
	}
	
	@SuppressWarnings("deprecation")
	public void show() {
		Date date= new Date();
		date.getYear();
	}
	
}
