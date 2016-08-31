package kr.co.ddit;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service{

	private MapClient client;
	
	private String a;
	private String b;
	private String c;
	
	public String getA() {
		return a;
	}



	public void setA(String a) {
		this.a = a;
	}



	public String getB() {
		return b;
	}



	public void setB(String b) {
		this.b = b;
	}



	public String getC() {
		return c;
	}



	public void setC(String c) {
		this.c = c;
	}



	public ServiceImpl(MapClient client){
		
		this.client=client;
	}
		


	@Override
	public List<String> allList() {
		
		List<String> list=new ArrayList();
		list.add(a);
		list.add(b);
		list.add(c);
		
		return list;
	}

	@Override
	public int insert() {
		System.out.println(a);
		return 0;
	}
	
}
