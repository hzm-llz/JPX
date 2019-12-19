package com.hp.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

public class JuintTest {

	SqlSession session = null;
	@Before
	public void before() throws IOException 
	{
		InputStream config = Resources.getResourceAsStream("Mybatis-Config.xml");
		
	}
}
