package com.jachs.jr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.jasper.bean.Fields;
import com.jasper.bean.ModelTableSource;
import com.jasper.bean.User;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/***
 * 
 * @author zhanchaohan
 *
 */
public class JrTest {

	@Test
	public void test() throws Exception {
		// map作为报表数据源
		Map<String, Object> parameters = new HashMap<String, Object>(16);
		parameters.put("title", "THIS IS TITLE");
		parameters.put("date", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		parameters.put("name", "jack");
		parameters.put("age", "18");
		parameters.put("dept", "开发部");
		parameters.put("gender", "男");

		FileInputStream isRef = new FileInputStream(
				new File(JrTest.class.getResource("/Template/jasper/DemoReport.jasper").getPath()));

		OutputStream os = new FileOutputStream(JrTest.class.getResource("").getPath() + File.separator + "test.pdf");

		JasperRunManager.runReportToPdfStream(isRef, os, parameters, new JREmptyDataSource());
	}

	@Test
	public void test1() throws Exception {
		String jrxmlPath=JrTest.class.getResource("/Template/jrxml/DemoReport4.jrxml").getPath();
		String jasperPath=JrTest.class.getResource("/Template/jasper/DemoReport4.jasper").getPath();
		
		OutputStream os = new FileOutputStream(JrTest.class.getResource("").getPath() + File.separator + "test2.pdf");
		FileInputStream isRef = new FileInputStream(jasperPath);
		
		JasperCompileManager.compileReportToFile(jrxmlPath, jasperPath);
		
		
		
		Map<String, Object> parameters = new HashMap<String, Object>(16);
		List<User> list = new ArrayList<User>();
		User user1 = new User(1,"小明",20,1);
		User user2 = new User(2,"小虎",20,1);
		User user3 = new User(3,"小风",20,2);
		User user4 = new User(4,"stevle",20,2);
		User user5 = new User(5,"小南",20,3);
		User user6 = new User(6,"小翔",20,3);
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		list.add(user6);
		
		JasperRunManager.runReportToPdfStream(isRef, os, parameters, new JRBeanCollectionDataSource(list));
	}
	@Test
	public void test2() throws Exception {
		List<Fields> list = new ArrayList<Fields>();
		for(int i = 1 ; i <= 20; i++) {
			Fields fields = new Fields("field"+i,"field"+(i+1),"field"+(i+2),"field"+(i+3),"field"+(i+4),"field"+(i+5),"field"+(i+6),"field"+(i+7));
			list.add(fields);
		}
		
		Map<String,Object> parameters = new HashMap<String,Object>(16);
		String jrxmlPath=JrTest.class.getResource("/Template/jrxml/DemoReport5.jrxml").getPath();
		String jasperPath=JrTest.class.getResource("/Template/jasper/DemoReport5.jasper").getPath();
		
		OutputStream os = new FileOutputStream(JrTest.class.getResource("").getPath() + File.separator + "test3.pdf");
		FileInputStream isRef = new FileInputStream(jasperPath);
		
		
		//编译jrxml生产jasper文件
		JasperCompileManager.compileReportToFile(jrxmlPath, jasperPath);
		
		ModelTableSource mts = new ModelTableSource();
		mts.setDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		mts.setTableData(new JRBeanCollectionDataSource(list));
		List<ModelTableSource> mlist = new ArrayList<ModelTableSource>();
		mlist.add(mts);
		//new JRBeanCollectionDataSource(list)  以javaBean为数据源注入报表数据
		JasperRunManager.runReportToPdfStream(isRef, os, parameters, new JRBeanCollectionDataSource(mlist));
	}
}
